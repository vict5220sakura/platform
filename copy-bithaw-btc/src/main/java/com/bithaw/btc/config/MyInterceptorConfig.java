package com.bithaw.btc.config;

import com.bithaw.btc.interceptor.MyRpcInterceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器配置
 * @Description: 
 * @author wangkang
 * @date 2018-08-09 21:28
 */
@Configuration
public class MyInterceptorConfig extends WebMvcConfigurerAdapter{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myRpcInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

  
    @Bean
    MyRpcInterceptor  myRpcInterceptor(){
        return new MyRpcInterceptor();
    }
}
