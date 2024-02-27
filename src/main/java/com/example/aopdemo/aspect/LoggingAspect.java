package com.example.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(public void com.example.aopdemo.repository.AccountRepository.addAccount())")
    public void logBeforeAdvice(){
        System.out.println("Logging before method call");
    }
}
