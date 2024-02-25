package com.config.test.add;

import org.springframework.stereotype.Component;

@Component
public class Demo {
    public Demo() {
        System.out.println("Inside outer package");
    }
    public Demo getDemo(){
        return new Demo();
    }
}
