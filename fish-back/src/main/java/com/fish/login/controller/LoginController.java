package com.fish.login.controller;

import com.fish.back.DataResponse;
import com.fish.model.user.UserInfo;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public DataResponse login(UserInfo params) {
        return new DataResponse(1000, "success", new Gson().toJson(params));
    }

}
