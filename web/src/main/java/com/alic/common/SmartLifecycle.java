package com.alic.common;

/**
 * 智能生命周期接口
 *
 * @author suxingzhe
 * @create 2018-03-26 下午12:55
 **/
public interface SmartLifecycle /*extends Lifecycle, Phased */{
    boolean isAutoStartup();

    void stop(Runnable callback);
}
