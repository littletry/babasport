package top.lt.core.service.product;

import cn.itcast.common.page.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.lt.core.bean.product.Color;
import top.lt.core.bean.product.ColorQuery;
import top.lt.core.bean.product.ProductQuery;
import top.lt.core.dao.product.ColorDao;
import top.lt.core.dao.product.ProductDao;

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
        }else {
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
        pagination.pageView(url,params.toString());
        return pagination;
    }

    //加载颜色
    @Autowired
    private ColorDao colorDao;

    //颜色结果集
    public List<Color> selectColorList(){
        ColorQuery colorQuery = new ColorQuery();
        colorQuery.createCriteria().andParentIdNotEqualTo(0L);
        return colorDao.selectByExample(colorQuery);
    }
}
