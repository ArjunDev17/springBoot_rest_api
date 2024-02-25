package com.example.demo.config;

import com.example.demo.couple.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class MyConfig {
    @Bean("bean3")
    public Employee getEmployee(){
        return new Employee("part-time");
    }
    public void getMyConfigInfo(){
        System.out.println("it is outside package");
    }
}
