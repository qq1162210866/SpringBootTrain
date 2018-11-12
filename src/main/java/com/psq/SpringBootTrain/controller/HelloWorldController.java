package com.psq.SpringBootTrain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
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
public class HelloWorldController {

    public static void main(String[] args) {
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
    public String HelloWorld() {
        /**
         *
         * 功能描述:
         *
         * @param: []
         * @return: java.lang.String
         * @auther: pengshiquan
         * @date: 2018/11/12 7:16 PM
         */
        return "Hello World";
    }
}
