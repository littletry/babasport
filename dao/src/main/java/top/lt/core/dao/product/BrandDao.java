package top.lt.core.dao.product;

import top.lt.core.bean.product.Brand;
import top.lt.core.bean.product.BrandQuery;

import java.util.List;

/**查询品牌列表
 * @author LittleTry
 * @date 2017-10-27
 */
public interface BrandDao {
    /**
     * 查询品牌的结果集
     * @param brandQuery 查询条件的对象
     * @return  品牌列表
     */
    public List<Brand> selectBrandListByQuery(BrandQuery brandQuery);


}
