package com.psq.springboottrain.controller;

import com.psq.springboottrain.base.BaseController;
import com.psq.springboottrain.pojo.UserDO;
import com.psq.springboottrain.service.MongoDBTrainService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * MongoDBTrainController.java
 * Description:
 *
 * @author Peng Shiquan
 * @date 2019-03-15
 */
@RestController
@RequestMapping(value = "mongoDBTrain")
@Api(description = "MongoDB练习接口")
public class MongoDBTrainController extends BaseController {


    @Autowired
    private MongoDBTrainService mongoDBTrainService;

    /**
     * Method: saveUserToMongo
     * Description:
     *
     * @param userDO
     * @return java.util.Map<java.lang.String, java.lang.Object>
     */
    @PostMapping(value = "/saveUser")
    @ResponseBody
    @ApiOperation(value = "保存对象", notes = "将user对象保存到mongo数据库中")
    public Map<String, Object> saveUserToMongo(@RequestBody UserDO userDO) {

        Integer resultInt = mongoDBTrainService.saveUserToMongo(userDO);
        if (resultInt == 1) {
            return responseResult(RESPONSE_SUCCESS, "查询成功", null);
        } else {
            return responseResult(RESPONSE_FAIL, "查询失败", null);
        }
    }

    /**
     * 功能描述: 根据userName查询mongo中的数据
     *
     * @param: [userName]
     * @return: java.util.Map
     * @author: pengshiquan
     * @date: 2018/12/1 11:21 AM
     */
    @GetMapping(value = "selectByuserName")
    @ResponseBody
    @ApiOperation(value = "查询对象", notes = "根据userName查询相应的对象")
    public Map<String, Object> selectUserByUserName(String userName) {
        UserDO userDO = mongoDBTrainService.getUserByUserName(userName);
        if (userDO == null) {
            return responseResult(RESPONSE_FAIL, "查询失败", null);
        }
        return responseResult(RESPONSE_SUCCESS, "查询成功", userDO);
    }
}
