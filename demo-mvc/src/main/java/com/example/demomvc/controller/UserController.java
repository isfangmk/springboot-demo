package com.example.demomvc.controller;



import com.example.common.api.CommonResult;
import com.example.common.exception.Asserts;
import com.example.demomvc.entity.UmsAdmin;
import com.example.demomvc.mapper.UmsAdminMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @Author: 方明坤
 * @Date: 2021/09/10/8:36
 * @Description:
 */

@RestController
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @GetMapping("/list") 
    public CommonResult list() {
        // 返回列表
        List<UmsAdmin> umsAdmins = umsAdminMapper.selectList(null);
        return CommonResult.success(umsAdmins);
    }

    @GetMapping("/exception")
    public CommonResult exception() {

        Asserts.fail("发生异常");
        return CommonResult.success("测试异常");
    }
    @GetMapping("/log")
    public CommonResult log() {

        logger.trace("Trace 日志...");
        logger.debug("Debug 日志...");
        logger.info("Info 日志...");
        logger.warn("Warn 日志...");
        logger.error("Error 日志...");
        return CommonResult.failed("测试日志");
    }


}
