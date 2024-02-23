package com.example.demo.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("person")
public class Person {

//    @Qualifier("dog")
    Animal animal;
    @Autowired
    public Person( @Qualifier("dog") Animal animal){
         this.animal=animal;
    }
    public void playWithAnimal(){
       animal.play();
    }
}
