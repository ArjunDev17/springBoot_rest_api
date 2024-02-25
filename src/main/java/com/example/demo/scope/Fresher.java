package com.example.demo.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Fresher {
    @Autowired
    private Technology technology;

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    public Fresher() {
        System.out.println("Creating Fresher");
    }

    public void accessLevel(){
        System.out.println("Few Project can access");
    }
}
