package com.example.demo;

import com.example.demo.couple.Animal;
import com.example.demo.couple.Cat;
import com.example.demo.couple.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import test.Test;


@SpringBootApplication
//@ComponentScans({
//		@ComponentScan(basePackages = "com.example.demo"),
//		@ComponentScan(basePackages = "com.example.demo.couple")
//})
@ComponentScan(basePackages = {"com.example.demo","test"})
public class DemoApplication {
	public static void main(String[] args) {
//		Animal animal=new Cat();
//		Person person=new Person(animal);
//		person.playWithAnimal();
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Person personBean = context.getBean(Person.class);
		personBean.playWithAnimal();
		System.out.println(context);
		Test testBean = context.getBean(Test.class);
		testBean.testing();
		Animal dog=context.getBean("dog", Animal.class);
		dog.play();


	}

}
