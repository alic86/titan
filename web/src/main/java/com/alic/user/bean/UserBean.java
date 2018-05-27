package com.alic.user.bean;

import com.alic.dto.BaseEntity;
import lombok.Data;

/**
 * @author suxingzhe
 * @create 2018-05-14
 **/
@Data
public class UserBean extends BaseEntity {
    private String name;
    private String passWord;
}
