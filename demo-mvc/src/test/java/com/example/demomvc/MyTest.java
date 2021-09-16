package com.example.demomvc;

import com.example.demomvc.entity.UmsAdmin;
import com.example.demomvc.mapper.UmsAdminMapper;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author: 方明坤
 * @Date: 2021/09/15/17:23
 * @Description:
 */
@SpringBootTest
class MyTest {
    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Test
    void testSelect() {
        List<UmsAdmin> umsAdmins = umsAdminMapper.selectList(null);
        umsAdmins.forEach(System.out::println);
    }


}
