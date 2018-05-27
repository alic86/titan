package com.alic.aop;

import com.alic.common.log.LogUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author suxingzhe
 * @create 2018-05-15
 **/
@Aspect
@Service
public class LogAdvice extends LogUtil {
    @Before("com.alic.common.log.LogPointCut.logAppend())")
    public void doBeginLog(JoinPoint joinPoint) {
        joinPointPrint(joinPoint, "before");
    }

    @After("com.alic.common.log.LogPointCut.logAppend()")
    public void doEndLog(JoinPoint joinPoint) {
        joinPointPrint(joinPoint, "after");
    }

    private void joinPointPrint(JoinPoint joinPoint, String name){
        String classname = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        logger.debug("{} Execute! --class name : {}, method name : {}, args : {} " , name, classname, methodName, args);
    }
}
