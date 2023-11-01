package com.lsc.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Api(value = "IndexController", tags = { "接口" })
@RequestMapping("/IndexController")
public class IndexController {

    @GetMapping("/index/{value}")
    public ModelAndView index(ModelAndView mav, @PathVariable("value") String value) {
        mav.getModelMap().addAttribute("key", value);
        mav.setViewName("index");
        return mav;
    }
}
