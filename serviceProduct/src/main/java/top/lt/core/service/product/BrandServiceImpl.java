package top.lt.core.service.product;


import cn.itcast.common.page.Pagination;
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
    @Override
    public Pagination selectPaginationByQuery(String name, Integer isDisplay, Integer pageNo){
        BrandQuery brandQuery = new BrandQuery();
        //当前页
        brandQuery.setPageNo(Pagination.cpn(pageNo));
        //每页数
        brandQuery.setPageSize(3);

        StringBuilder params = new StringBuilder();

        //条件
        if (null != name){
            brandQuery.setName(name);
            params.append("name=").append(name);
        }
        if (null != isDisplay){
            brandQuery.setIsDisplay(isDisplay);
            params.append("&isDisplay=").append(isDisplay);
        }else {
            brandQuery.setIsDisplay(1);
            params.append("&isDisplay=").append(1);
        }

        Pagination pagination = new Pagination(
            brandQuery.getPageNo(),
            brandQuery.getPageSize(),
            brandDao.selectCount(brandQuery)
        );
        //设置结果集
        pagination.setList(brandDao.selectBrandListByQuery(brandQuery));
        //分页展示
        String url = "/brand/list.do";
        pagination.pageView(url, params.toString());

        return pagination;
    }

}
