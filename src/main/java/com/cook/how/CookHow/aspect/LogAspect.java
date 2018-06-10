package com.cook.how.CookHow.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LogAspect {

    private final Log log = LogFactory.getLog(this.getClass());

    @Before("execution (* com.cook.how.CookHow.controller.*.*(..))")
    public void logBeforeController(JoinPoint joinPoint) {
        log.info("Entering in Method: " + joinPoint.getSignature().getName());
        log.debug("With Arguments: " + Arrays.toString(joinPoint.getArgs()));
    }

    @After("execution (* com.cook.how.CookHow.controller.*.*(..))")
    public void logAfterController(JoinPoint joinPoint) {
        log.info("Exit Method: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution (* com.cook.how.CookHow.repository.*.*(..))", returning = "result")
    public void logAfterRepository(JoinPoint joinPoint, Object result) {
        log.info("Exit Method: " + joinPoint.getSignature().getName());
        log.debug("With Value: " + result != null ? result.toString() : "NULL");
    }


}
