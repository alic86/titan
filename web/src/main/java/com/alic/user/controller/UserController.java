package com.alic.user.controller;

import com.alibaba.fastjson.JSON;
import com.alic.user.dto.UserDTO;
import com.alic.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suxingzhe
 * @create 2018-05-14
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("user_info")
    public String getUserInfo(){
        UserDTO user = userService.getUser();
        return JSON.toJSONString(user);
    }
}
