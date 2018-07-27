package com.fish.service.user.impl;

import com.fish.dao.user.UserVipInfoMapper;
import com.fish.model.user.UserVipInfo;
import com.fish.service.user.IUserVipInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fish on 2018/7/27.
 */
@Service
public class UserVipInfoService implements IUserVipInfoService {

    @Autowired
    private UserVipInfoMapper userVipInfoMapper;

    @Override
    public UserVipInfo userLogin(UserVipInfo params) {
        return userVipInfoMapper.userLogin(params);
    }
}
