package com.psq.SpringBootTrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 *
 * 功能描述: 项目启动类
 *
 * @Package: com.psq.SpringBootTrain
 * @ClassName: SpringBootTrainApplication
 * @author: pengshiquan
 * @CreateDate: 2018/11/29 5:04 PM
 * @UpdateUser: pengshiquan
 * @UpdateDate: 2018/11/29 5:04 PM
 */
@SpringBootApplication
public class SpringBootTrainApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootTrainApplication.class, args);
    }
}
