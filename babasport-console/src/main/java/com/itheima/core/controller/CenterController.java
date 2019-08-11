package com.itheima.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@类名:CenterController
 *@描述:TODO
 *@作者:wanglei
 *@日期:19/8/11 上午1:48
 *@版本:1.0
 **/
@Controller
public class CenterController {

    //入口页面
    @RequestMapping(value = "/control/index.do")
    public String index(){
        return "index";
    }

    //入口页面 头
    @RequestMapping(value = "/control/top.do")
    public String top(){
        return "top";
    }

    //入口页面 身体
    @RequestMapping(value = "/control/main.do")
    public String main(){
        return "main";
    }

    //入口页面 身体  左
    @RequestMapping(value = "/control/left.do")
    public String left(){
        return "left";
    }

    //入口页面 身体  右
    @RequestMapping(value = "/control/right.do")
    public String right(){
        return "right";
    }

    //商品身体
    @RequestMapping(value = "/control/frame/product_main.do")
    public String product_main(){
        return "frame/product_main";
    }
    //商品身体   --左
    @RequestMapping(value = "/control/frame/product_left.do")
    public String product_left(){
        return "frame/product_left";
    }
    //广告身体
    @RequestMapping(value = "/control/frame/ad_main.do")
    public String ad_main(){
        return "frame/ad_main";
    }
    //广告身体   --左
    @RequestMapping(value = "/control/frame/ad_left.do")
    public String ad_left(){
        return "frame/ad_left";
    }
}
