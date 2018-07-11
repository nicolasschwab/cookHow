package com.cook.how.CookHow.aspect;

import java.util.Arrays;

import com.cook.how.CookHow.exception.ElementCantBeEmpty;
import com.cook.how.CookHow.exception.InternalServerError;
import com.cook.how.CookHow.exception.StringLengthMustBeGraterThanThree;
import com.cook.how.CookHow.factory.ResponseFactory;
import com.cook.how.CookHow.util.Response;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

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
    
    @AfterThrowing(pointcut = "execution(* com.cook.how.CookHow.controller.*.*(..))", throwing = "ex")
    public void logError(Exception ex) {
        if(isNotKnownException(ex)){
            ex.printStackTrace();
        }
    }

    @AfterReturning(pointcut = "execution (* com.cook.how.CookHow.repository.*.*(..))", returning = "result")
    public void logAfterRepository(JoinPoint joinPoint, Object result) {
        log.info("Exit Method: " + joinPoint.getSignature().getName());
        log.debug("With Value: " + result != null ? result.toString() : "NULL");
    }

    private Boolean isNotKnownException(Exception ex){
        return !(ex instanceof ElementCantBeEmpty) && !(ex instanceof InternalServerError) && ! (ex instanceof StringLengthMustBeGraterThanThree) ;
    }

}
