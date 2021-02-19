package com.pjhuc.service;

import com.pjhuc.bean.ParamBean;
import com.pjhuc.bean.UserBean;
import com.pjhuc.dao.UserDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    UserDao ud;

    public UserDao getUd() {
        return ud;
    }

    @Override
    public List userinfo() {
        return ud.userinfo();
    }

    @Override
    public UserBean getUserById(int id) {
        return ud.getUserById(id);
    }

    @Override
    public void updateUser(UserBean ub) {
        ud.updateUser(ub);
    }

    @Override
    public void deleteUser(int id) {
        ud.deleteUser(id);
    }

    public void setUd(UserDao ud) {
        this.ud = ud;
    }

    public UserBean login(String username, String userps) {
        ParamBean params = new ParamBean(username,userps);
        return ud.login(params);
    }



}
