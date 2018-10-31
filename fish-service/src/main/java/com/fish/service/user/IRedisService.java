package com.fish.service.user;

/**
 * Created by fishs on 2018/10/31.
 */
public interface IRedisService {

    /**
     * 保存到缓存
     *
     * @param key
     * @param value
     */
    void set(String key, String value);

    /**
     * 保存到缓存
     *
     * @param key
     * @param value
     * @param timeOut 超时时间 秒
     */
    void set(String key, String value, long timeOut);

    /**
     * 通过key获取
     *
     * @param key
     * @return
     */
    String get(String key);

    /**
     * 通过key移除
     *
     * @param key
     */
    void remove(String key);

}
