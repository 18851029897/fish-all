package com.fish.service.user;

import com.fish.model.user.UserInfo;

import java.util.List;

/**
 * Created by fish on 2018/7/14.
 */
public interface IUserInfoService {

    UserInfo findUserByUserId(Integer userId);

    List<UserInfo> findUserList(UserInfo params);
}
