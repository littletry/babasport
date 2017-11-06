package top.lt.core.service.product;

import cn.itcast.common.page.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.lt.core.bean.product.*;
import top.lt.core.dao.product.ColorDao;
import top.lt.core.dao.product.ProductDao;
import top.lt.core.dao.product.SkuDao;

import java.util.Date;
import java.util.List;

/**
 * @author LittleTry
 * @date 2017-11-04
 */
@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    //分页对象
    @Override
    public Pagination selectPaginationByQuery(Integer pageNo, String name, Long brandId, Boolean isShow) {

        ProductQuery productQuery = new ProductQuery();
        productQuery.setPageNo(Pagination.cpn(pageNo));
        //排序
        productQuery.setOrderByClause("id desc");

        ProductQuery.Criteria criteria = productQuery.createCriteria();
        StringBuilder params = new StringBuilder();
        if (null != name) {
            criteria.andNameLike("%" + name + "%");
            params.append("name=").append(name);
        }
        if (null != brandId) {
            criteria.andBrandIdEqualTo(brandId);
            params.append("&brandId=").append(brandId);
        }
        if (null != isShow) {
            criteria.andIsShowEqualTo(isShow);
            params.append("&isShow=").append(isShow);
        } else {
            criteria.andIsShowEqualTo(false);
            params.append("&isShow=").append(false);
        }

        Pagination pagination = new Pagination(
                productQuery.getPageNo(),
                productQuery.getPageSize(),
                productDao.countByExample(productQuery),
                productDao.selectByExample(productQuery)
        );
        String url = "/product/list.do";
        pagination.pageView(url, params.toString());
        return pagination;
    }

    //加载颜色
    @Autowired
    private ColorDao colorDao;

    //颜色结果集
    @Override
    public List<Color> selectColorList() {
        ColorQuery colorQuery = new ColorQuery();
        colorQuery.createCriteria().andParentIdNotEqualTo(0L);
        return colorDao.selectByExample(colorQuery);
    }

    @Autowired
    private SkuDao skuDao;
    //商品保存
    @Override
    public void insertProduct(Product product) {
        //保存商品
        //商品编号全国唯一

        //下架状态 后台程序写的
        product.setIsShow(false);
        //删除 后台程序写的不删除
        product.setIsDel(true);
        productDao.insertSelective(product);
        //返回ID
        String[] colors = product.getColors().split(",");
        String[] sizes = product.getSizes().split(",");
        for (String color :colors) {
            for (String size:sizes) {
                //保存SKU
                Sku sku = new Sku();
                //商品ID
                sku.setProductId(product.getId());
                //颜色
                sku.setColorId(Long.parseLong(color));
                //尺码
                sku.setSize(size);
                //市场价
                sku.setMarketPrice(999f);
                //售价
                sku.setPrice(666f);
                //运费
                sku.setDeliveFee(8f);
                //库存
                sku.setStock(0);
                //限制
                sku.setUpperLimit(200);
                //时间
                sku.setCreateTime(new Date());

                skuDao.insertSelective(sku);
            }
        }
    }
}
