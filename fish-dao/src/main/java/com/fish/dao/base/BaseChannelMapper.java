package com.fish.dao.base;

import com.fish.model.base.BaseChannel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by fish on 2018/10/27.
 */
@Mapper
public interface BaseChannelMapper {

    @Select("select id as id, " +
            "channel_name as channelName, " +
            "channel_url as channelUrl, " +
            "channel_img_url as channelImgUrl, " +
            "is_del as isDel, " +
            "modify_date as modifyDate, " +
            "create_date as createDate " +
            "from base_channel where is_del = 0")
    @ResultType(BaseChannel.class)
    List<BaseChannel> findChannels();

}
