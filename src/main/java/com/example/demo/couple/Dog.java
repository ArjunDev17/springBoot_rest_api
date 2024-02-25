package com.example.demo.couple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("dog")
@Component
//@Qualifier("dog")
@Primary
public class Dog implements Animal{
    @Override
    public void play() {
        System.out.println("dog is playing");
    }
}
