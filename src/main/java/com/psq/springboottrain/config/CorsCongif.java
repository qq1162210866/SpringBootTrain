package com.psq.springboottrain.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 功能描述: 处理ajax跨域请求
 *
 * @Package: com.psq.springboottrain.config
 * @ClassName: CorsCongif
 * @auther: pengshiquan
 * @CreateDate: 2018/12/27 8:31 AM
 * @UpdateUser: pengshiquan
 * @UpdateDate: 2018/12/27 8:31 AM
 */
@Configuration
public class CorsCongif extends WebMvcConfigurerAdapter {
    static final String ORIGINS[] = new String[]{"GET", "POST", "PUT", "DELETE"};

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*").allowCredentials(true).allowedMethods(ORIGINS)
                .maxAge(3600);
    }

}
