package com.psq.springboottrain.service;

/**
 * 功能描述: RedisTrain接口
 *
 * @Package: com.psq.SpringBootTrain.service
 * @ClassName: RedisTrainService
 * @author: pengshiquan
 * @CreateDate: 2018/11/14 7:44 PM
 * @UpdateUser: pengshiquan
 * @UpdateDate: 2018/11/14 7:44 PM
 */
public interface RedisTrainService {


    /**
     *
     * 功能描述:保存键值对到redis中
     *
     * @param: [key, value]
     * @return: java.lang.Integer
     * @author: pengshiquan
     * @date: 2018/11/14 8:42 PM
     */
    Integer saveRedisValueByKey(String key, String value);


}
