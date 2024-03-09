package com.codeneeti.springMvc.controllers;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.web.bind.annotation.*;

@RestController
public class Products {
    Logger logger = LoggerFactory.getLogger(Products.class);
    /*
     *  @RequestParam(value ="brand",defaultValue = "MI",required = false)String brand)
     * here brand brand same so we can remove brand variable from value
     * */

    @GetMapping("/products")
    public String getProducts(

        @RequestParam("name") String productName,
        @RequestParam("price") int price,
        @RequestParam(value = "brand", defaultValue = "MI", required = false) String brand) {
        System.out.println("Product name :" + productName);
        System.out.println("Product Price :" + price);

        logger.error("product Name" + productName);
        return "this is created";
    }

    @GetMapping("/getProd/{productId}/{productName}")
    public String getDetails(
//            @PathVariable ("productId") String pId,   alternative
            @PathVariable String productId,
            @PathVariable String productName
           ) {
        System.out.println("****************************");
        logger.error("pid {}", productId);

        logger.info("Executing getHelloMessage method");
        logger.debug("debugging mode");
        System.out.println("pid :" + productId);
        System.out.println("product Name :" + productName);


        return "done";
    }
}
