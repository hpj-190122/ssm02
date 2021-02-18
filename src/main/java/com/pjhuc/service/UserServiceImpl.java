package com.pjhuc.service;

import com.pjhuc.bean.ParamBean;
import com.pjhuc.bean.UserBean;
import com.pjhuc.dao.UserDao;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    UserDao ud;

    public UserDao getUd() {
        return ud;
    }

    public void setUd(UserDao ud) {
        this.ud = ud;
    }

    public UserBean login(String username, String userps) {
        ParamBean params = new ParamBean(username,userps);
        return ud.login(params);
    }

}
