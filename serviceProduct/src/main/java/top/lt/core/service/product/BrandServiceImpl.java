package top.lt.core.service.product;

import javafx.scene.control.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.lt.core.bean.product.BrandQuery;
import top.lt.core.dao.product.BrandDao;

/**品牌管理
 * @author LittleTry
 * @date 2017-10-27
 */
@Service("brandService")
@Transactional
public class BrandServiceImpl implements BrandService{

    @Autowired
    private BrandDao brandDao;
    /**
     * 查询分页对象
     */
    public Pagination selectPaginationByQuery(String name,Integer isDisplay,Integer pageNo){
        BrandQuery brandQuery = new BrandQuery();





        Pagination pagination = new Pagination(



        );



        return pagination;
    }

}
