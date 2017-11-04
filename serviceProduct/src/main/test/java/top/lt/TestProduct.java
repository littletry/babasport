package top.lt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.lt.core.bean.product.Product;
import top.lt.core.bean.product.ProductQuery;
import top.lt.core.dao.product.ProductDao;

import java.util.List;

/** 测试类  junit + Spring
 * @author LittleTry
 * @date 2017-10-26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestProduct {

    @Autowired
    private ProductDao productDao;

    @Test
    public void testAdd() throws Exception{
        //通过id查询商品
        /*Product product = productDao.selectByPrimaryKey(441L);
        System.out.println(product.toString());*/

        /**
         * 条件 、分页  指定字段 查询  排序
         */
        ProductQuery productQuery = new ProductQuery();
        //productQuery.createCriteria().andBrandIdEqualTo(4L).andNameLike("%好莱坞%");
        productQuery.setPageNo(2);
        productQuery.setPageSize(10);
        productQuery.setOrderByClause("id ");
        List<Product> products = productDao.selectByExample(productQuery);
        for (Product product:products) {
            System.out.println(product);
        }

    }


}
