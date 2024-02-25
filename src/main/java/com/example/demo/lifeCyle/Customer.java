package com.example.demo.lifeCyle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    public Customer() {
        System.out.println("# :Bean life cycle");
    }
    @PostConstruct
    public void initDB(){
        System.out.println("# :initialization is mandatory");
    }
    @PreDestroy
    public void closeDB(){

        System.out.println("# :connection closed");
    }
}
