package top.lt.core.service.product;

import top.lt.core.bean.product.Sku;

import java.util.List;

/**
 * @author LittleTry
 * @date 2017-11-08
 */
public interface SkuService {
    /**
     *  商品ID 查询 库存结果集
     * @param productId
     * @return
     */
    public List<Sku> selectSkuListByProductId(Long productId);

    /**
     * 修改
     * @param sku
     */
    public void updateSkuById(Sku sku);
}
