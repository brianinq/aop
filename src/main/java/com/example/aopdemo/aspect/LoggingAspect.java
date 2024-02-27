package com.example.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
//    @Before("execution( * add*())") // no args
//    @Before("execution( * add*(*))") // method with one arg of any type
    @Before("execution( * addAccount(..))")  // 0 or more arguments of any type
    public void logBeforeAdvice(){
        System.out.println("Logging before method call");
    }
}
