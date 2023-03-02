package com.lsc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloController")
public class HelloCtrler {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

}
