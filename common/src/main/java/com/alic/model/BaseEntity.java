package com.alic.model;

import lombok.Data;

/**
 * 基础实体类
 *
 * @author suxingzhe
 * @create 2018-04-04 下午2:53
 **/
@Data
public class BaseEntity {
    private Integer id;
    private Integer createTime;
    private Integer updateTime;
    private Integer deleteTime;
    private Integer isDeleted;
}
