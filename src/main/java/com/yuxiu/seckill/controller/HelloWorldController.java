package com.yuxiu.seckill.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/echo/{echoString}")
    public String hello(@PathVariable("echoString") String echoString) {
        return echoString;
    }
}
