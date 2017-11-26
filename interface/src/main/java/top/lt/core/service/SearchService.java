package top.lt.core.service;

import top.lt.core.bean.product.Product;

import java.util.List;

/**
 * @author LittleTry
 * @date 2017-11-27
 */
public interface SearchService {
    /**
     *全文检索
     * @param keyword
     * @return
     */
    public List<Product> selectProductListByQuery(String keyword) throws Exception;
}
