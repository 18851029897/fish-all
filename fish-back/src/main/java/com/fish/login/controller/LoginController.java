package com.fish.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fish on 2018/7/26.
 */
@Controller
public class LoginController {

    @RequestMapping("")
    public String login() {
        return "login";
    }

}
