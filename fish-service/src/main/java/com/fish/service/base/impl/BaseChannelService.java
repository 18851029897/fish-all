package com.fish.service.base.impl;

import com.fish.dao.base.BaseChannelMapper;
import com.fish.model.base.BaseChannel;
import com.fish.service.base.IBaseChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fish on 2018/10/27.
 */
@Service
public class BaseChannelService implements IBaseChannelService {

    @Autowired
    private BaseChannelMapper baseChannelMapper;

    @Override
    public List<BaseChannel> findChannels() {
        return this.baseChannelMapper.findChannels();
    }
}
