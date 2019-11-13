package com.hyz.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hyz.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Reference(version = "1.0.0")
    private IUserService userService;

    @GetMapping("login")
    public String login() {
        Boolean bResult = userService.login("hyz", "hyz");
        logger.info("登陆情况：" + bResult);
        return bResult + "";
    }

}
