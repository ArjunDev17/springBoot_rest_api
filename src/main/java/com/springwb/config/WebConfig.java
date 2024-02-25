package com.springwb.config;

import com.springwb.web.WebController;
import org.springframework.stereotype.Component;

@Component
public class WebConfig {
    public WebController getWebController(){
        return new WebController();
    }
}
