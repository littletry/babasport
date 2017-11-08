package top.lt.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.lt.core.bean.product.Sku;
import top.lt.core.service.product.SkuService;

import java.util.List;

/** 库存管理
 *  去库存页面
 *  js  修改
 * @author LittleTry
 * @date 2017-11-08
 */
@Controller
public class SkuController {

    @Autowired
    private SkuService skuService;

    //去库存页面
    @RequestMapping(value = "/sku/list.do")
    public String list(Long productId,Model model){

        List<Sku> skus = skuService.selectSkuListByProductId(productId);
        model.addAttribute("skus",skus);
        return "sku/list";
    }

}
