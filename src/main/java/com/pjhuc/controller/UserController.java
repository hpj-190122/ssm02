package com.pjhuc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value="/test")
@Controller
public class UserController {

    @RequestMapping(value="/test.do")
    public String test() {
        System.out.println("nihao");
        return "index";
    }

    @RequestMapping(value="test02.do")
    public ModelAndView test02() {
        ModelAndView model = new ModelAndView();
        model.addObject("info","hello");
        model.setViewName("index");
        return model;
    }

}
