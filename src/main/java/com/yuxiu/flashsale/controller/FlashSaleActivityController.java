package com.yuxiu.flashsale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlashSaleActivityController {

    @RequestMapping("/addFlashSaleActivity")
    public String addFlashSaleActivity() {
        //spring boot default action, it will trying to find a page called add_activity.html
        //browser will then open the add_activity.html page
        return "add_activity";

    }

    @ResponseBody()
    public String addFlashSaleActivityAction() {
        
    }
}
