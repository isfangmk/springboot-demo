package com.example.demomvc.config;

import com.example.common.exception.GlobalExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 方明坤
 * @Date: 2021/09/16/10:45
 * @Description:
 */
@Configuration
public class WebConfig {

    // 自定义的全局异常处理器
    @Bean
    public GlobalExceptionHandler globalExceptionHandler() {
        return new GlobalExceptionHandler();
    }

}
