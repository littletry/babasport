package top.lt.core.service.product;

import cn.itcast.common.page.Pagination;
import top.lt.core.bean.product.Brand;

/**
 * @author LittleTry
 * @date 2017-10-27
 */
public interface BrandService {
    /**
     * 查询分页对象
     * @param name 品牌名称
     * @param isDisplay 是否上架
     * @param pageNo 页号
     * @return
     */
    public Pagination selectPaginationByQuery(String name, Integer isDisplay, Integer pageNo);

    /**
     * 通过id查询
     * @param id
     * @return
     */
    public Brand selectBrandById(Long id);
}
