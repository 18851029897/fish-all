package com.fish.login.controller;

import com.fish.back.DataResponse;
import com.fish.model.user.UserInfo;
import com.fish.model.user.UserVipInfo;
import com.fish.service.user.IUserInfoService;
import com.fish.service.user.IUserVipInfoService;
import com.fish.service.user.impl.RedisService;
import com.fish.util.EmptyUtil;
import com.fish.util.MD5Util;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Created by fish on 2018/7/26.
 */
@Controller
public class LoginController {

    @Autowired
    private RedisService redisService;

    @Autowired
    private IUserVipInfoService userVipInfoService;

    @Autowired
    private IUserInfoService userInfoService;


    @RequestMapping("")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public DataResponse login(UserVipInfo params) {
        String inputPass = params.getUserPass();
        params = this.userVipInfoService.userLogin(params);
        if (EmptyUtil.isEmpty(params)) {
            return new DataResponse(1001, "用户不存在.");
        }
        String pwd = MD5Util.MD5Encode(inputPass, "utf-8");
        if (pwd.equals(params.getUserPass())) {
            return new DataResponse(1000, "success", new Gson().toJson(params));
        } else {
            return new DataResponse(1001, "用户名或密码错误.");
        }
    }


    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public DataResponse test(@RequestBody UserInfo params) {
        this.redisService.set("test", "1234", 50);
        return new DataResponse(1000, this.userInfoService.findUserList(params));
    }

}
