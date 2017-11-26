package top.lt.core.service;

import cn.itcast.common.page.Pagination;
import top.lt.core.bean.product.Product;

import java.util.List;

/**
 * @author LittleTry
 * @date 2017-11-27
 */
public interface SearchService {
    /**
     * 全文检索
     * @param pageNo
     * @param keyword
     * @return
     * @throws Exception
     */
    public Pagination selectPaginationByQuery(Integer pageNo,String keyword) throws Exception;
}
