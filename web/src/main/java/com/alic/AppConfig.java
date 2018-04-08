package com.alic;

import com.alic.service.CacheService;
import com.alic.service.impl.RedisCacheService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Spring配置入口
 *
 * @author suxingzhe
 * @create 2018-04-04 上午10:07
 **/
@Configuration
@ComponentScan(basePackages = "com.alic")
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    public CacheService myService() {
        return new RedisCacheService();
    }
}
