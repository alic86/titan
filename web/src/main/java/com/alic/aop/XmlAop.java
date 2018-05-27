package com.alic.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

/**
 * @author suxingzhe
 * @create 2018-05-15
 **/
public class XmlAop {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public void doBeginLog(JoinPoint joinPoint) {
        logger.debug("aop log begin");
        joinPointPrint(joinPoint, "before");
        System.out.println("dddddddd");
    }

    public void doEndLog(JoinPoint joinPoint) {
        logger.debug("aop log end");
        joinPointPrint(joinPoint, "after");
        System.out.println("ffffffff");
    }

    private void joinPointPrint(JoinPoint joinPoint, String name){
        String classname = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        logger.debug("{} Execute! --class name : {}, method name : {}, args : {} " , name, classname, methodName, args);
    }
}
