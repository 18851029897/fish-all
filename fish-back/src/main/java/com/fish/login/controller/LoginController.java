package com.fish.login.controller;

import com.fish.back.DataResponse;
import com.fish.model.user.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fish on 2018/7/26.
 */
@Controller
public class LoginController {

    @RequestMapping("")
    public String login() {
        return "login";
    }

    @RequestMapping("login")
    @ResponseBody
    public DataResponse login(String userId) {
        System.out.print(1);
        return null;
    }

}
