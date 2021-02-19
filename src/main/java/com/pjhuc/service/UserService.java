package com.pjhuc.service;

import com.pjhuc.bean.UserBean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public UserBean login(String username, String userps);
    public List userinfo();
    public UserBean getUserById(int id);
    public void updateUser(UserBean ub);
    public void deleteUser(int id);

}
