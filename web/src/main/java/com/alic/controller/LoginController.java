package com.alic.controller;

import com.alibaba.fastjson.JSON;
import com.alic.user.dto.UserDTO;
import com.alic.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 登录
 *
 * @author suxingzhe
 * @create 2018-05-14
 **/
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping
    public String login(UserDTO userDTO){
        UserDTO user = userService.getUser();
        return JSON.toJSONString(user);
    }

    @GetMapping(path = "/users/{userId}", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public UserDTO login2(@PathVariable String userId){
        return userService.getUser();
    }
}
