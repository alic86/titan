package com.alic;

import com.alic.service.CacheService;
import com.alic.service.RedisCacheService;

/**
 * Spring配置入口
 *
 * @author suxingzhe
 * @create 2018-04-04 上午10:07
 **/
//@Configuration
//@ComponentScan(basePackages = "com.alic")
//@EnableAspectJAutoProxy
public class AppConfig {
//    @Bean
    public CacheService myService() {
        return new RedisCacheService();
    }
}
