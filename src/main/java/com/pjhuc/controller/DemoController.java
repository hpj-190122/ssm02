package com.pjhuc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value="/")
@SessionAttributes(value="info")
@Controller
public class DemoController {

    @RequestMapping(value="/demo.do")
    public String test(Model m) {
        System.out.println("demo");
        m.addAttribute("info","demoAdd");
//        return "redirect:/WEB-INF/jsp/index.jsp";
        return "redirect:/test/test.do";
    }
}
