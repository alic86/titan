package com.alic;

import com.alic.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author suxingzhe
 * @create 2018-05-15
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/application-context.xml"})
public class SprintTest {
    @Resource
    private UserService userService;

    @Test
    public void test01(){
        userService.getUser();
    }
}
