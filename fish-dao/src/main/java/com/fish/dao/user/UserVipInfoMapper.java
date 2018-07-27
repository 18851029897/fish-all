package com.fish.dao.user;

import com.fish.model.user.UserVipInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

/**
 * Created by fish on 2018/7/27.
 */
@Mapper
public interface UserVipInfoMapper {

    @Select("select user_id as userId, user_nick_name as userNickName, user_pass as userPass, user_tel as userPhone from user_vip_info where user_tel = #{userPhone}")
    @ResultType(UserVipInfo.class)
    UserVipInfo userLogin(UserVipInfo params);

}
