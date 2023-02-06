package com.itheima.core.dao;

import com.itheima.core.po.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("SELECT * FROM `sys_user` WHERE user_code=#{usercode} AND user_password=#{password} and user_state='1'")
    public User findUser(@Param("usercode") String usercode,
                         @Param("password") String password);


}
