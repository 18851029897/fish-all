package com.fish.controller;

import com.fish.model.user.UserInfo;
import com.fish.service.user.IUserInfoService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by fish on 2018/7/14.
 */
@Controller
@RequestMapping(value = "/user")
public class UserInfoController {

    @Autowired
    private IUserInfoService userInfoService;

    @RequestMapping(value = "/index")
    public String index() {
        return "user/index";
    }

    @RequestMapping(value = "/show")
    @ResponseBody
    public String show(Integer userId) {
//        UserInfo user = this.userInfoService.findUserByUserId(userId);
        List<UserInfo> list = this.userInfoService.findUserList();
        return new Gson().toJson(list);
    }

}
