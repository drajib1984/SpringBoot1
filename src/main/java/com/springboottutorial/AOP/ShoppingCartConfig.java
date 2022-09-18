package com.springboottutorial.AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.springboottutorial.AOP")
@EnableAspectJAutoProxy
public class ShoppingCartConfig {
}
