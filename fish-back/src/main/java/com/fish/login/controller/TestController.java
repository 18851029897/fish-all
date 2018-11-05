package com.fish.login.controller;

import com.alibaba.fastjson.JSONObject;
import com.fish.common.back.DataResponse;
import com.fish.common.constant.RedisConstant;
import com.fish.common.util.MappingUtil;
import com.fish.model.book.BookType;
import com.fish.model.user.UserInfo;
import com.fish.service.book.IBookTypeService;
import com.fish.service.user.IRedisService;
import com.fish.service.user.IUserInfoService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by fish on 2018/11/5.
 */
@Controller
public class TestController {

    @Autowired
    private IRedisService redisService;

    @Autowired
    private IUserInfoService userInfoService;

    @Autowired
    private IBookTypeService bookTypeService;

    public static void main(String args[]) {
        System.out.println(MappingUtil.getResultsStr(BookType.class));
    }


    @RequestMapping(value = "/testRedis", method = RequestMethod.POST)
    @ResponseBody
    public DataResponse testRedis(@RequestBody UserInfo params) {
        List<UserInfo> data = this.userInfoService.findUserList(params);
        this.redisService.set(RedisConstant.USER_INFO_LIST, JSONObject.toJSONString(data));
        return new DataResponse(1000, data);
    }


    @RequestMapping(value = "/testBookType", method = RequestMethod.POST)
    @ResponseBody
    public DataResponse testBookType(@RequestBody BookType params) {
        BookType data = this.bookTypeService.findBookType(params);
        return new DataResponse(1000, "success", JSONObject.toJSONString(data));
    }

    @RequestMapping(value = "/testBookTypeList", method = RequestMethod.POST)
    @ResponseBody
    public DataResponse testBookTypeList(@RequestBody BookType params) {
        List<BookType> data = this.bookTypeService.findBookTypeList(params);
        return new DataResponse(1000, "success", JSONObject.toJSONString(data));
    }
}
