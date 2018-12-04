package com.psq.SpringBootTrain.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述:
 *
 * @Package: com.psq.SpringBootTrain.controller
 * @ClassName: HelloWorldController
 * @auther: pengshiquan
 * @CreateDate: 2018/11/12 7:56 PM
 * @UpdateUser: pengshiquan
 * @UpdateDate: 2018/11/12 7:56 PM
 */
@RestController
@RequestMapping(value = "/helloWorld")
@Api(description = "HelloWorld相关接口")
public class HelloWorldController {

    @GetMapping(value = "/hello")
    @ResponseBody
    @ApiOperation(value = "测试接口", notes = "第一次建立项目时的Hello World")
    public String HelloWorld() {
        /**
         *
         * 功能描述: Hello World接口
         *
         * @param: []
         * @return: java.lang.String
         * @auther: pengshiquan
         * @date: 2018/11/12 7:16 PM
         */
        return "Hello World";
    }
}
