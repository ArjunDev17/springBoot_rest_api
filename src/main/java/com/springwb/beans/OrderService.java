package com.springwb.beans;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public OrderService() {
        System.out.println("Order created successfully");
    }
    public void orderStatus(){
        System.out.println("Order status :Delivered");
    }
}
