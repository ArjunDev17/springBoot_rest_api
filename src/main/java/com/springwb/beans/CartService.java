package com.springwb.beans;

import org.springframework.stereotype.Component;

@Component
public class CartService {
    public CartService() {
        System.out.println("Cart Created");
    }
    public void applyCart(){
        System.out.println("You applied for cart");
    }
}
