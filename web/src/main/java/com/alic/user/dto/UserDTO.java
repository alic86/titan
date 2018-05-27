package com.alic.user.dto;

import com.alic.dto.BaseEntity;
import lombok.Data;

/**
 * 用户
 *
 * @author suxingzhe
 * @create 2018-05-14
 **/
@Data
public class UserDTO extends BaseEntity {
    private String name;
    private String passWord;
}
