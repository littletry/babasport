package top.lt.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**后台管理
 * @author LittleTry
 * @date 2017-10-27
 */
@Controller
public class CenterController {

    //入口
    /**
     * ModelAndView  : 跳转视图+数据     不用
     * void  : 异步时 ajax
     * String  : 跳转视图      +  Model
     */
    @RequestMapping(value = "/test/index.do")
    public String index(Model model){

        return "index";
    }
}
