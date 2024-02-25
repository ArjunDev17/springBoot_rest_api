package com.springwb.config;

import com.springwb.beans.CartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@ComponentScan(basePackages = {"com.springwb","com.config.test"})
//as bellow given line by using basePackages access another packages configuration bean i
// can use by passing in constructor
@Configuration
@ComponentScan(basePackages = {"com.springwb","com.config.test"})
public class AppConfig {
    @Bean("cartService1")
    public CartService getCartService(){
        return new CartService();
    }
}
