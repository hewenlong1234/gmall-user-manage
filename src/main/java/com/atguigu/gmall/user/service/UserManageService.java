package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UserInfo;

import java.util.List;

public interface UserManageService {

    //查询用户所有信息
    List<UserInfo> getUserInfoListAll();

    //添加用户
    void addUser(UserInfo userInfo);

    //修改用户
    void updateUser(UserInfo userInfo);

    //通过非主键修改用户
    void updateUserByName(String name,UserInfo userInfo);

    //删除用户
    void deleteUser(UserInfo userInfo);
}
