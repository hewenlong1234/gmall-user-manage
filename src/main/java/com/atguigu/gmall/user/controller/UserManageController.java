package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UserInfo;
import com.atguigu.gmall.user.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserManageController {
    @Autowired
    private UserManageService userManageService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<UserInfo> findAll(){
       return userManageService.getUserInfoListAll();
    }

    @RequestMapping("add")
    @ResponseBody
    public void add(){
        UserInfo userInfo = new UserInfo();
        userInfo.setLoginName("liuqian");
        userInfo.setPasswd("789456");
        userInfo.setName("liuqian123");
        userInfo.setNickName("LIUQIAN");
        userInfo.setPhoneNum("8976");
        userInfo.setEmail("liuqian@qq.com");
        userInfo.setHeadImg("4");
        userInfo.setUserLevel("4");

        userManageService.addUser(userInfo);
    }

    @RequestMapping("update")
    @ResponseBody
    public void update(){
        UserInfo userInfo = new UserInfo();
        userInfo.setId("4");
        userInfo.setLoginName("dashabi");
        userManageService.updateUser(userInfo);
    }

    @RequestMapping("update1")
    @ResponseBody
    public void update1(String name){
        UserInfo userInfo = new UserInfo();

        userInfo.setNickName("haojiubujian");
        userManageService.updateUserByName(name,userInfo);

    }

    @RequestMapping("delete")
    @ResponseBody
    public void delete(){
        UserInfo userInfo = new UserInfo();
        userInfo.setId("6");
        userManageService.deleteUser(userInfo);
    }
}
