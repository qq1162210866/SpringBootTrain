package com.psq.SpringBootTrain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: SpringBootTrain
 * @BelongsPackage: com.psq.SpringBootTrain.controller
 * @Author: yanyu
 * @CreateTime: 2018-11-11 20:02
 * @Description: 初始化controller,RestController默认以json形式输出
 */
@RestController
public class HelloWorldController {

    public static void main(String[] args){
       /**
        *
        * 功能描述:
        *
        * @param: [args]
        * @return: void
        * @auther: yanyu
        * @date: 2018/11/11 20:28
        */
    }
    @RequestMapping(value = "/hello")
    public String HelloWorld(){
        /**
         *
         * 功能描述: helloworld
         *
         * @param: null
         * @return: java.lang.String
         * @auther: yanyu
         * @date: 2018/11/11 20:37
         */
        return "Hello World";
    }
}
