package top.lt.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.lt.core.bean.product.Product;
import top.lt.core.service.SearchService;

import java.util.List;

/**     前台商品
 * @author LittleTry
 * @date 2017-11-10
 */
@Controller
public class ProductController {
    //去首页入口
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
    @Autowired
    private SearchService searchService;
    //搜索
    @RequestMapping(value = "/search")
    public String search(String keyword, Model model) throws Exception {
        List<Product> products = searchService.selectProductListByQuery(keyword);
        model.addAttribute("products",products);
        return "search";
    }
}
