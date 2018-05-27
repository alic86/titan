package com.alic;

import com.alic.gateway.flux.AccessLimitService;
import com.alic.proxy.CglibProxy;
import org.junit.Test;

/**
 * @author suxingzhe
 * @create 2018-05-09
 **/
public class CglibTest {
    @Test
    public void test01(){
        final CglibProxy proxy = new CglibProxy();
        AccessLimitService service = (AccessLimitService)proxy.getProxy(AccessLimitService.class);
        service.tryAcquire();
    }
}
