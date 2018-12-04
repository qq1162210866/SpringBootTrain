package com.psq.SpringBootTrain.service.impl;

import com.psq.SpringBootTrain.service.RedisTrainService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @Package: com.psq.SpringBootTrain.service.impl
 * @ClassName: RedisTrainServiceImpl
 * @auther: pengshiquan
 * @CreateDate: 2018/11/14 7:44 PM
 * @UpdateUser: pengshiquan
 * @UpdateDate: 2018/11/14 7:44 PM
 */
@Service
public class RedisTrainServiceImpl implements RedisTrainService {
    private RedisTemplate redisTemplate;


    @Override
    public Integer saveRedisValueByKey(String key, String value) {
        //获取redis资源
        ValueOperations<String, String> stringStringValueOperations = redisTemplate.opsForValue();
        Integer result = 0;
        try {
            stringStringValueOperations.set(key, value);
            result = 1;
        } catch (Exception e) {
            result = 0;
        }finally {
            //业务代码不需要关心redis资源的获取和释放，连接池已经做好了，此处是无用的代码。
        }
        return result;
    }
}
