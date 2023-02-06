package com.itheima.core.service;

import com.itheima.core.po.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    public User findUser(String usercode, String password);
}
