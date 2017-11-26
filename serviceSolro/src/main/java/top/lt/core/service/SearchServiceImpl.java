package top.lt.core.service;

import cn.itcast.common.page.Pagination;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lt.core.bean.product.Product;
import top.lt.core.bean.product.ProductQuery;

import java.util.ArrayList;
import java.util.List;

/**全文检索  用的Solr
 * @author LittleTry
 * @date 2017-11-27
 */
@Service("searchService")
public class SearchServiceImpl implements SearchService{

    @Autowired
    private SolrServer solrServer;
    //全文检索
    @Override
    public Pagination selectPaginationByQuery(Integer pageNo,String keyword) throws Exception{
        //创建包装类
        ProductQuery productQuery = new ProductQuery();
        //当前页
        productQuery.setPageNo(Pagination.cpn(pageNo));
        //每页显示12条
        productQuery.setPageSize(15);

        //拼接条件
        StringBuilder params = new StringBuilder();

        List<Product> products = new ArrayList<Product>();
        SolrQuery solrQuery = new SolrQuery();
        //关键词
        solrQuery.set("q","name_ik:" + keyword);
        params.append("keyword=").append(keyword);
        //高亮
        //排序
        //分页 limit 开始行，每页显示条数
        solrQuery.setStart(productQuery.getStartRow());
        solrQuery.setRows(productQuery.getPageSize());

        //执行查询
        QueryResponse response = solrServer.query(solrQuery);

        //结果集
        SolrDocumentList docs = response.getResults();
        //发现的条数（总条件）构建分页时用到
        long numFound = docs.getNumFound();
        for (SolrDocument doc:docs) {
            //创建商品对象
            Product product = new Product();
            //商品ID
            String id = (String) doc.get("id");
            product.setId(Long.parseLong(id));
            //商品名称
            String name = (String) doc.get("name_ik");
            product.setName(name);
            //图片
            String url = (String) doc.get("url");
            product.setImgUrl(url);
            //价格 售价
            Float price = (Float) doc.get("price");
            product.setPrice(price);
            //品牌ID
            Integer brandId = (Integer) doc.get("brandId");
            product.setBrandId(Long.parseLong(String.valueOf(brandId)));

            products.add(product);
        }
        //构建分页对象
        Pagination pagination = new Pagination(
                productQuery.getPageNo(),
                productQuery.getPageSize(),
                (int)numFound,
                products
        );
        //页面展示
        String url = "/search";
        pagination.pageView(url,params.toString());
        return pagination;
    }
}
