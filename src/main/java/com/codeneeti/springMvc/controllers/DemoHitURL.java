package com.codeneeti.springMvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoHitURL {

    @RequestMapping("/about")
    public String getAbout() {
        // Consider using a logging framework instead of System.out.println
        System.out.println("Inside about");
        return "about"; // Make sure "about" is a valid view name
    }

}
