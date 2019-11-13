package com.hyz.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hyz.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0")
@Component
public class UserService implements IUserService {

    private Logger logger = LoggerFactory.getLogger(UserService.class);

    public boolean login(String username, String password) {
        logger.info("用户登录：[username:{}, password:{}]", username, password);
        if (username != null && password != null && username.equals(password)) {
            logger.info("用户校验通过。[username:{}]", username);
            return true;
        }
        logger.info("用户校验失败！[username:{}]", username);
        return false;
    }

}
