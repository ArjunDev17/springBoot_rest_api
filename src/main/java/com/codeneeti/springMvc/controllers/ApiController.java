package com.codeneeti.springMvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/hello")
    public String getMsg(){
        return "hello brother";
    }
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public String getUser() {
        return "{" +
                "\"user1\":\"ram\"," +
                "\"user2\":\"Shyam\"" +
                "}";
    }
    @GetMapping("/info")
    public String getInfo(){
        return "Alternativ of  @RequestMapping(value = \"/info\",method = RequestMethod.GET)";
    }

}
