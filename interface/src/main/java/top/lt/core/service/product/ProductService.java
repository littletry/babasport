package top.lt.core.service.product;

import cn.itcast.common.page.Pagination;
import top.lt.core.bean.product.Color;

import java.util.List;

/**
 * @author LittleTry
 * @date 2017-11-04
 */
public interface ProductService {
    /**
     * 分页查询商品
     * @param pageNo
     * @param name
     * @param brandId
     * @param isShow
     * @return
     */
    public Pagination selectPaginationByQuery(Integer pageNo, String name, Long brandId, Boolean isShow);

    /**
     * 查询所有颜色
     * @return
     */
    public List<Color> selectColorList();
}
