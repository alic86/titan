package com.alic;

import org.junit.Test;

import java.io.File;
import java.lang.reflect.Modifier;

/**
 * 单元测试类
 *
 * @author suxingzhe
 * @create 2018-04-10 下午10:08
 **/
public class TitanTest {
    public static final Kitty kitty = (field) -> {
        System.out.println(field);
    };

    @FunctionalInterface
    private interface Kitty {
        void func(String name);
    }

    @Test
    public void myTest01(){
        kitty.func("hello kitty");
        final String property = System.getProperty("user.dir") + File.separator + "target" + File.separator + "classes";
        System.out.println(property);
    }
    @Test
    public void test02(){
        final TitanTest titanTest = new TitanTest();
        final ClassLoader classLoader = titanTest.getClass().getClassLoader();
        System.out.println(classLoader);

        try {
            final Class<?> aClass = Class.forName("com.alic.TitanTest");
            System.out.println(aClass.getClassLoader());
            System.out.println(aClass.getClassLoader() == classLoader);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
