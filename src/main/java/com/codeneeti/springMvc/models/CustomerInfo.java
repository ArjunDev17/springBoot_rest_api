package com.codeneeti.springMvc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CustomerInfo {
    private String name;
//    @JsonIgnore
    private  int age;
    private String email;

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
