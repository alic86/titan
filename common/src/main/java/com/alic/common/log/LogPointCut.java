package com.alic.common.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

/**
 * 日志AOP
 *
 * @author suxingzhe
 * @create 2018-05-12 下午1:18
 **/
@Aspect
@Service
public class LogPointCut {
    @Pointcut("execution(* com.alic.*..*(..))")
    public void logAppend(){}
}
