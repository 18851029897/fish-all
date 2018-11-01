package com.fish.service.user.impl;

import com.fish.common.constant.RedisConstant;
import com.fish.service.user.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * Created by fish on 2018/10/31.
 */
@Service
public class RedisService implements IRedisService {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private JedisPool jedisPool;

    @Override
    public void set(String key, String value) {
        Jedis jedis = jedisPool.getResource();
        jedis.setex(key, RedisConstant.TIME_OUT, value);
    }

    @Override
    public void set(String key, String value, long timeOut) {
        this.redisTemplate.opsForValue().set(key, value, timeOut, TimeUnit.SECONDS);
    }

    @Override
    public String get(String key) {
        return this.redisTemplate.opsForValue().get(key).toString();
    }

    @Override
    public void remove(String key) {
        this.redisTemplate.delete(key);
    }
}
