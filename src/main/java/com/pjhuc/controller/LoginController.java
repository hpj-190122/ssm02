package com.pjhuc.controller;

import com.pjhuc.bean.UserBean;
import com.pjhuc.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@RequestMapping(value = "/")
@Controller
@SessionAttributes(value="userbean")
public class LoginController {

    @Autowired
    private UserServiceImpl us;

    @RequestMapping(value = "/login.do")
    public String login(String username, String password, Model model) {
        System.out.println(username);
        System.out.println(password);
        UserBean ub = us.login(username, password);
        if (ub != null) {
            model.addAttribute("userbean", ub);
//            return "jsp/index.jsp";
            return "redirect:/user/userinfo.do";
        } else {
            model.addAttribute("error", "用户名密码错误！");
            return "jsp/login.jsp";
        }
    }

}
