package com.springboottutorial.AOP;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkOut(String status){
        //examples of aspects are below
        //logging
        //authorization
        //sanitize the data
        //Above all are cross-cutting concerns that need to be seperated from business logic as per AOP
        System.out.println("Checkout method called from ShoppingCart");
    }

    public int orderQuantity(){
        return 15;
    }
}
