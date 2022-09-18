package com.springboottutorial.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.springboottutorial.AOP.ShoppingCart.checkOut(..))")
    public void beforeCheckout(){
        System.out.println("Calling for logging check BEFORE the checkout method called");
    }
    @After("execution(* com.springboottutorial.AOP.ShoppingCart.checkOut(..))")
    //*->any return type *->any package *->any class
    public void afterCheckout(JoinPoint joinPoint){
        String s = Arrays.toString(joinPoint.getArgs());
        System.out.println("Calling for logging check AFTER the checkout method called"+ s);
    }
    @Pointcut("execution(* com.springboottutorial.AOP.ShoppingCart.orderQuantity(..))")
    public void orderQuantityPointCut(){

    }
    @AfterReturning(value = "orderQuantityPointCut()",returning = "returnValue")
    public void orderQuantity(String returnValue){
        System.out.println("Order quantity: "+returnValue);
    }
}
