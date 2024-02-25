package com.example.demo.couple;

import com.example.demo.config.MyConfig;
import com.example.demo.scope.Fresher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("person")
public class Person {

    //    @Qualifier("dog")
    @Autowired
    Animal animal;
    @Autowired
    Student student;
    @Autowired
   @Qualifier("bean3")
    Employee employee;
    MyConfig myConfig;

    public Person(MyConfig myConfig) {
        this.myConfig = myConfig;
    }
    public Animal getAnimal() {
        return animal;
    }
    public Student getStudent() {
        return student;
    }

    // setter based dependency injection this will be used when dependency are optional
//    @Autowired commented because we are going to see field based dependency
    public void setAnimal(Animal animal) {
        System.out.println("Autowired for Animal");
        this.animal = animal;
    }
//    @Autowired
    public void setStudent(Student student) {
        System.out.println("Autowired for Student");
        this.student = student;
    }

//----------------------------------------------------

//        //constructor based dependency injection 1: when compulsory dependency
//        ---------------------------------------------------
//        @Autowired
//        public Person( Animal animal,Student student){
//            System.out.println("constructor based..Autowired");
//         this.animal=animal;
//         this.student=student;
//    }
    public void playWithAnimal() {
        animal.play();
        student.Details();
        employee.infoEmployee();
        myConfig.getMyConfigInfo();

    }
}
