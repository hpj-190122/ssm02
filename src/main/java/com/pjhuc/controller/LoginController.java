package com.pjhuc.controller;

import com.pjhuc.bean.UserBean;
import com.pjhuc.service.UserService;
import com.pjhuc.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/")
@Controller
public class LoginController {

    @Autowired
    private UserServiceImpl us;

    @RequestMapping(value="/login.do")
    public String login(String username, String password, Model model) {
        System.out.println(username);
        System.out.println(password);
        UserBean ub = us.login(username, password);
        if(ub != null) {
            model.addAttribute("username",username);
            return "WEB-INF/jsp/index.jsp";
        }else {
            model.addAttribute("error","用户名密码错误！");
            return "WEB-INF/jsp/login.jsp";
    }
    }

}
