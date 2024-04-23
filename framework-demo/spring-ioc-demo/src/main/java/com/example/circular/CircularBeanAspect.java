package com.example.circular;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author jy
 */
@Component
@Aspect
public class CircularBeanAspect {

    @Pointcut("within(com.example.circular.*)")
    public void circularBeanPointCut() {
        // NO-OP
    }

    @Before("circularBeanPointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("before circularBeanPointCut");
    }

}
