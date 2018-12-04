package com.psq.SpringBootTrain.service;

import com.psq.SpringBootTrain.pojo.UserDO;

/**
 * 功能描述: 关于MongoDB的练习服务
 *
 * @Package: com.psq.SpringBootTrain.service
 * @ClassName: MongoDBTrainService
 * @auther: pengshiquan
 * @CreateDate: 2018/11/30 3:16 PM
 * @UpdateUser: pengshiquan
 * @UpdateDate: 2018/11/30 3:16 PM
 */
public interface MongoDBTrainService {

    /**
     * 功能描述: 将对象保存到mongodb数据库中
     *
     * @param: [userDO]
     * @return: java.lang.Integer
     * @author: pengshiquan
     * @date: 2018/11/30 3:36 PM
     */
    Integer saveUserToMongo(UserDO userDO);

    /**
     * 功能描述: 根据用户名来查询mongo中的数据
     *
     * @param: [name]
     * @return: com.psq.SpringBootTrain.pojo.UserDO
     * @author: pengshiquan
     * @date: 2018/12/1 10:11 AM
     */
    UserDO getUserByUserName(String name);

}
