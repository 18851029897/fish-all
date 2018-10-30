package com.fish.service.user.impl;

import com.fish.dao.user.UserInfoMapper;
import com.fish.model.user.UserInfo;
import com.fish.service.user.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fish on 2018/7/15.
 */
@Service
public class UserInfoService implements IUserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo findUserByUserId(Integer userId) {
        UserInfo user = this.userInfoMapper.findByUserId(userId);
        return user;
    }

    @Override
    public List<UserInfo> findUserList(UserInfo params) {
        return this.userInfoMapper.findUserList(params);
    }

}
