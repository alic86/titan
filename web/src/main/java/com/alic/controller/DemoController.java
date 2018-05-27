package com.alic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author suxingzhe
 * @create 2018-05-24
 **/
@Controller
public class DemoController {
    @GetMapping("/demo")
    public void handle(@CookieValue("JSESSIONID") String cookie) {
        System.out.println(cookie);
    }
}
