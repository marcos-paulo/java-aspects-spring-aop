package com.marcos.java_aspects_spring_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {

  @Before("execution(* com.marcos.java_aspects_spring_aop.dummy.*.*(..))")
  public void logBefore(JoinPoint joinPoint) {
    System.out.println("Before: - " + joinPoint.getSignature());
  }

  @Around("execution(* com.marcos.java_aspects_spring_aop.dummy.*.*(..))")
  public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
    System.out.println("Before Around: - " + joinPoint.getSignature());
    Object object = joinPoint.proceed();
    System.out.println("After Around: - " + joinPoint.getSignature());
    return object;
  }

}
