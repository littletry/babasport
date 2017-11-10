package top.lt.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
