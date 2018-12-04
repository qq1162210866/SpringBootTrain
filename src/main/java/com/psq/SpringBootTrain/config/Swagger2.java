package com.psq.SpringBootTrain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 *
 * 功能描述: swagger配置文件
 *
 * @Package: com.psq.SpringBootTrain.config
 * @ClassName: Swagger2
 * @author: pengshiquan
 * @CreateDate: 2018/11/29 10:39 AM
 * @UpdateUser: pengshiquan
 * @UpdateDate: 2018/11/29 10:39 AM
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.psq.SpringBootTrain.controller"))

                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("公共服务接口文档说明")
                .description("module-mysql")
                .termsOfServiceUrl("￥￥￥￥￥￥￥￥￥￥￥￥")
                .version("1.0")
                .build();
    }

}