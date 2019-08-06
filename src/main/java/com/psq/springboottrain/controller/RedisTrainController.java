package com.psq.springboottrain.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述: redis练习Train
 *
 * @Package: com.psq.SpringBootTrain.controller
 * @ClassName: RedisTrainController
 * @auther: pengshiquan
 * @CreateDate: 2018/11/14 7:23 PM
 * @UpdateUser: pengshiquan
 * @UpdateDate: 2018/11/14 7:23 PM
 */
@RestController
@RequestMapping(value = "redisTrain")
@Api(value = "Redis练习接口")
public class RedisTrainController {
    /**
     * 功能描述: 存入到redis数据库中
     *
     * @param: [key, value]
     * @return: java.lang.String
     * @auther: pengshiquan
     * @date: 2018/11/14 7:26 PM
     */
    public String redisSetMethod(String key, String value) {
        return null;
    }
}
