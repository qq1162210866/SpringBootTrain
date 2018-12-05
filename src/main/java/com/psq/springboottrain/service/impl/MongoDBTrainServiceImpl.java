package com.psq.springboottrain.service.impl;

import com.psq.springboottrain.pojo.UserDO;
import com.psq.springboottrain.service.MongoDBTrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

/**
 * 功能描述: MongoDB服务接口实现类
 *
 * @Package: com.psq.SpringBootTrain.service.impl
 * @ClassName: MongoDBTrainServiceImpl
 * @auther: pengshiquan
 * @CreateDate: 2018/11/30 3:30 PM
 * @UpdateUser: pengshiquan
 * @UpdateDate: 2018/11/30 3:30 PM
 */
@Service
public class MongoDBTrainServiceImpl implements MongoDBTrainService {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 功能描述: 将传来的对象保存到mongodb中
     *
     * @param: [userDO]
     * @return: java.lang.Integer 成功返回1，失败返回0
     * @author: pengshiquan
     * @date: 2018/11/30 3:38 PM
     */
    @Override
    public Integer saveUserToMongo(UserDO userDO) {
        try {
            mongoTemplate.insert(userDO);
            return 1;
        } catch (Exception e) {
            System.err.println(e);
            return 0;
        }
    }

    /**
     * 功能描述:根据用户名来查询mongo中的数据
     *
     * @param: [name]
     * @return: UserDO 成功返回对象，失败返回空
     * @author: pengshiquan
     * @date: 2018/12/1 10:12 AM
     */
    @Override
    public UserDO getUserByUserName(String userName) {
        Query query = new Query(Criteria.where("userName").is(userName));
        UserDO userDO = mongoTemplate.findOne(query, UserDO.class);
        return userDO;
    }
}
