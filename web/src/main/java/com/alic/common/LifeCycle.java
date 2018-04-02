package com.alic.common;

/**
 * 生命周期接口定义
 *
 * @author suxingzhe
 * @create 2018-03-26 下午12:01
 **/
public interface LifeCycle {
    void start();

    void stop();

    boolean isRunning();
}
