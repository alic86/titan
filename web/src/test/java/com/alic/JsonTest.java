package com.alic;

import com.alibaba.fastjson.JSON;
import com.alic.user.dto.UserDTO;
import org.junit.Test;

/**
 * @author suxingzhe
 * @create 2018-05-14
 **/
public class JsonTest {
    @Test
    public void test01(){
        UserDTO user = new UserDTO();
        user.setId(1);
        user.setName("alic86");
        user.setPassWord("45UI(&^");

        final String json = JSON.toJSONString(user);
        System.out.println(json);
    }

    @Test
    public void test02(){

    }
}
