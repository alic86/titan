package com;

import org.springframework.aop.framework.AopContext;

/**
 * @author suxingzhe
 * @create 2018-05-18
 **/
public class SimplePojo {
    public void foo() {
        System.out.println("SimplePojo.foo");
        // this next method invocation is a direct call on the 'this' reference
        this.bar();
    }

    public void bar() {
        System.out.println("SimplePojo.bar");
        // some logic...
    }
}
