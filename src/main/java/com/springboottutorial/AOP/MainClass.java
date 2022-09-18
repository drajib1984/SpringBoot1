package com.springboottutorial.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ShoppingCartConfig.class);
        ShoppingCart bean = context.getBean(ShoppingCart.class);
        bean.checkOut("Order accepted");

    }
}
