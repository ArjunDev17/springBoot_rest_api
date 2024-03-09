package com.codeneeti.springMvc.controllers;

import com.codeneeti.springMvc.models.CustomerInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customer")
public class Customer {
/*
* we are receiving json format input which is conversing into java
* json--->java Deserialization
*
* java--->Json Serialization
* */
    @RequestMapping("/about")
    @PostMapping
    public ResponseEntity<CustomerInfo> setCustomer(@RequestBody List<CustomerInfo> customerInfo){
//        System.out.println(customerInfo);
//        Map<String,Object> data= new HashMap<>();
//        data.put("contetn",customerInfo);
//        data.put("error","No error");
//        data.put("current Date",new Date());

        ResponseEntity responseEntity=new ResponseEntity(customerInfo, HttpStatus.CREATED);
        return responseEntity;
    }
}
/*
*  public Map<String,Object> setCustomer(@RequestBody List<CustomerInfo> customerInfo){
        System.out.println(customerInfo);
        Map<String,Object> data= new HashMap<>();
        data.put("content",customerInfo);
        data.put("error","No error");
        data.put("current Date",new Date());
        return data;
    }
* */