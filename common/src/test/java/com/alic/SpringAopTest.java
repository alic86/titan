package com.alic;

import com.alic.common.log.LogPointCut;
import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * @author suxingzhe
 * @create 2018-05-18
 **/
public class SpringAopTest {
    @Test
    public void test01(){
        LogPointCut logPointCut = new LogPointCut();
        AspectJProxyFactory factory = new AspectJProxyFactory(logPointCut);
        factory.addAspect(LogPointCut.class);
        final Object proxy = factory.getProxy();
    }
}
