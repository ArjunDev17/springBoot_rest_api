package com.example.demo;

import com.example.demo.config.MyConfig;
import com.example.demo.couple.Animal;
import com.example.demo.couple.Cat;
import com.example.demo.couple.Employee;
import com.example.demo.couple.Person;
import com.example.demo.scope.Fresher;
import com.example.demo.scope.Technology;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Primary;
import test.Test;


@SpringBootApplication
//@ComponentScans({
//		@ComponentScan(basePackages = "com.example.demo"),
//		@ComponentScan(basePackages = "com.example.demo.couple")
//})
@ComponentScan(basePackages = {"com.example.demo",
		"test",
		"config"
})
public class DemoApplication {
	public static void main(String[] args) {
//		Animal animal=new Cat();
//		Person person=new Person(animal);
//		person.playWithAnimal();
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		Person personBean = context.getBean(Person.class);
//		personBean.playWithAnimal();
//		System.out.println(context);
//		Test testBean = context.getBean(Test.class);
//		testBean.testing();
//		MyConfig myConfigBean=context.getBean(MyConfig.class);
//		myConfigBean.getMyConfigInfo();
////		Animal dog=context.getBean("dog", Animal.class);
////		dog.play();

		//BeanScope :1
		System.out.println("****************************************");
//		Fresher beanfresher = context.getBean(Fresher.class);
//		System.out.println(beanfresher);
//		beanfresher.accessLevel();
//		Fresher bean = context.getBean(Fresher.class);
//		System.out.println(bean);
//		Fresher fresher = context.getBean(Fresher.class);
//		System.out.println(fresher);
//		Technology technology=fresher.getTechnology();
//		System.out.println(technology);
//
//		Fresher fresher1 = context.getBean(Fresher.class);
//		System.out.println(fresher1);
//		Technology technology1 = fresher1.getTechnology();
//		System.out.println(technology1);
	}
	//bellow give thing I did in MyConfig class which is a correct way
	@Bean("bean1")
	public Employee getEmployee1(){
//		System.out.println("first bean");
		return new Employee("fullTime");
	}
	@Bean(value = "bean2")
	@Primary
	public Employee getEmployee2(){
//		System.out.println("second bean");
		return new Employee("Intern");
	}
}
