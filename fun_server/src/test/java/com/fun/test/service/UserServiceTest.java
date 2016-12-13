package com.fun.test.service;

import java.util.Date;
import javax.annotation.Resource;

import com.fun.core.util.ApplicationUtils;
import com.fun.core.feature.test.TestSupport;
import com.fun.web.service.UserService;
import com.fun.web.model.User;

public class UserServiceTest extends TestSupport {

    @Resource
    private UserService userService;

//    @Test
    public void test_insert() {
        User model = new User();
        model.setUsername("starzou");
        model.setPassword(ApplicationUtils.sha256Hex("123456"));
        model.setCreateTime(new Date());
        userService.insert(model);
    }

//    @Test
    public void test_10insert() {
        for (int i = 0; i < 10; i++) {
            User model = new User();
            model.setUsername("starzou" + i);
            model.setPassword(ApplicationUtils.sha256Hex("123456"));
            model.setCreateTime(new Date());
            userService.insert(model);
        }
    }

}