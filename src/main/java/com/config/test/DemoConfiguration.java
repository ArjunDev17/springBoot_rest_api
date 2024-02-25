package com.config.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@Component
public class DemoConfiguration {
    public DemoConfiguration() {
        System.out.println("Out side created");
    }
}
