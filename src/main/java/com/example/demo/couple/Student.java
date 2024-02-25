package com.example.demo.couple;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student(){
        System.out.println("Student constructor");
    }
    public void Details(){
        System.out.println("all about student");
    }

}
