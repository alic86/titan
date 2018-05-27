package com.alic.aop;

import com.alic.common.log.LogUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 方法执行时间通知类
 *
 * @author suxingzhe
 * @create 2018-05-15
 **/
@Aspect
@Service
public class ExecutionTimeAdvice extends LogUtil {
    private void joinPointPrint(JoinPoint joinPoint, long startTime, long endTime){
        String classname = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        logger.debug("Execute! --class name : {}, method name : {}, args : {},  executed time : {}" , classname, methodName, args, endTime - startTime);
    }

    @Around("execution(* com.alic..dao.*DAOImpl.*(..))")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        // start stopwatch
        Object retVal = pjp.proceed();
        // stop stopwatch
        long endTime = System.currentTimeMillis();

        joinPointPrint(pjp, startTime, endTime);

        return retVal;
    }
}
