package com.pjhuc.dao;

import com.pjhuc.bean.ParamBean;
import com.pjhuc.bean.UserBean;

import java.util.List;

public interface UserDao {

    public UserBean login(ParamBean paramBean);
    public List userinfo();
    public UserBean getUserById(int id);
    public void updateUser(UserBean ub);
    public void deleteUser(int id);
    public void insertUserDao(UserBean ub);

}
