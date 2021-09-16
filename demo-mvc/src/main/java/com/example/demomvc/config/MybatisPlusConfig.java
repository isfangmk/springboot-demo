package com.example.demomvc.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 方明坤
 * @Date: 2021/09/15/17:18
 * @Description:
 */

@Configuration
@MapperScan("com.example.demomvc.mapper")
public class MybatisPlusConfig {
}
