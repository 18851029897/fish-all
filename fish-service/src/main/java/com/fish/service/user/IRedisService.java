package com.fish.service.user;

/**
 * Created by fishs on 2018/10/31.
 */
public interface IRedisService {

    /**
     * set存数据 * @param key * @param value * @return
     */
    void set(String key, String value, long timeOut);

    /**
     * get获取数据 * @param key * @return
     */
    String get(String key);

    /**
     * 移除数据 * @param key * @return
     */
    void remove(String key);

}
