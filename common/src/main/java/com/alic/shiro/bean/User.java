package com.alic.shiro.bean;

import lombok.Data;

/**
 * @author suxingzhe
 * @create 2018-05-22
 **/
@Data
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String passwordSalt;
}
