package top.lt.core.service.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lt.core.bean.product.Sku;
import top.lt.core.bean.product.SkuQuery;
import top.lt.core.dao.product.ColorDao;
import top.lt.core.dao.product.SkuDao;

import java.util.List;

/** 库存管理
 * @author LittleTry
 * @date 2017-11-08
 */
@Service("skuService")
public class SkuServiceImpl implements SkuService{

    @Autowired
    private SkuDao skuDao;
    @Autowired
    private ColorDao colorDao;

    //商品ID 查询 库存结果集
    @Override
    public List<Sku> selectSkuListByProductId(Long productId){
        SkuQuery skuQuery = new SkuQuery();
        skuQuery.createCriteria().andProductIdEqualTo(productId);
        List<Sku> skus = skuDao.selectByExample(skuQuery);
        //15
        for (Sku sku:skus) {
            //3条sql   一级缓存
            sku.setColor(colorDao.selectByPrimaryKey(sku.getColorId()));
        }

        return skus;
    }
}
