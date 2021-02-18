package com.pjhuc.service;

import com.pjhuc.bean.UserBean;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public UserBean login(String username, String userps);

}
