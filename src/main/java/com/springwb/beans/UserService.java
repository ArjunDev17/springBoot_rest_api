package com.springwb.beans;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public UserService() {
        System.out.println("all about user  ");
    }
    public void addUser(){
        System.out.println("User added successfully");
    }
}
