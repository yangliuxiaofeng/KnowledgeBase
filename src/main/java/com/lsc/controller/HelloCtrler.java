package com.lsc.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "HelloController", tags = { "接口" })
@RequestMapping("/HelloController")
public class HelloCtrler {

    @ApiOperation(value = "你好")
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

}
