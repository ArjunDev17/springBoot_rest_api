package com.example.demo.couple;

public class Employee {
    String role;
    public  Employee(String role){
        System.out.println("type of employee is :"+role);
        this.role=role;
    }
    public void infoEmployee(){
        System.out.println("Employee is live");
        System.out.println("we are auto wiring :"+role);
    }
}
