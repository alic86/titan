package com.alic.gateway.flux;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.stereotype.Service;

/**
 * guava限流
 *
 * @author suxingzhe
 * @create 2018-05-08 下午11:24
 **/
@Service
public class AccessLimitService {
    //每秒只发出5个令牌
    RateLimiter rateLimiter = RateLimiter.create(5.0);

    /**
     * 尝试获取令牌
     * @return
     */
    public boolean tryAcquire(){
        System.out.println("######## 限流 ########");
        return rateLimiter.tryAcquire();
    }
}
