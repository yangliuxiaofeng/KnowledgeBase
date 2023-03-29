package com.lsc.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.concurrent.TimeUnit;

/**
 * redis缓存处理类
 * @param <T>
 */
public class RedisHandler<T> {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 设置缓存基本对象
     * @param key 键
     * @param value 值
     */
    public void setCacheObject(String key, T value){
        try {
            redisTemplate.opsForValue().set(key, value, 24, TimeUnit.HOURS);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 根据键获取缓存对象
     * @param key 键
     * @param <T> 对象
     * @return
     */
    public <T> T getCacheObject(String key){
        ValueOperations<String, T> valueOperations = redisTemplate.opsForValue();
        return valueOperations.get(key);
    }

    /**
     * 根据键删除缓存对象
     * @param key
     */
    public void deleteCacheObject(String key){
        try {
            redisTemplate.delete(key);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
