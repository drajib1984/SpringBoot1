package com.springboottutorial.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticationAspect {
    @Pointcut("within(com.springboottutorial.AOP.ShoppingCart)")
    public void userAuthentication(){

    }
    @Pointcut("within(com.springboottutorial.AOP.ShoppingCart)")
    public void userAuthorization(){

    }
    @Before("userAuthentication() && userAuthorization()")
    public void authenticateAndAuthorize(){
        System.out.println("Authenticating & Authorizing user");
    }
}
