package com.springwb.config;

import com.springwb.beans.CartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"com.springwb"})
public class AppConfig {
    @Bean("cartService1")
    public CartService getCartService(){
        return new CartService();
    }
}
