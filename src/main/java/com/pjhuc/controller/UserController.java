package com.pjhuc.controller;

import com.pjhuc.bean.UserBean;
import com.pjhuc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

@RequestMapping(value="/user")
@Controller
public class UserController {

    @Autowired
    private UserService us;

    @RequestMapping(value="/userinfo.do")
    public String userinfo(Model m) {
        List uiList = us.userinfo();
        m.addAttribute("userinfoList",uiList);
        return "/jsp/index.jsp";
    }

    @RequestMapping(value="/pupdate.do")
    public String pupdate(int userId,Model m) {
        UserBean ub = us.getUserById(userId);
        m.addAttribute("ub", ub);
        return "/jsp/update.jsp";
    }

    @RequestMapping(value="/update.do",method = RequestMethod.POST)
    public String update(UserBean u,Model m) {
        us.updateUser(u);
        return this.userinfo(m);
    }

    @RequestMapping(value="/deleteuser.do")
    public String deleteUser(int userId,Model m) {
        us.deleteUser(userId);
        return this.userinfo(m);
    }


}
