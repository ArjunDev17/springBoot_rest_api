package com.springwb;

import com.springwb.beans.CartService;
import com.springwb.beans.OrderService;
import com.springwb.beans.UserService;
import com.springwb.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "App Started" );
//        we need to create object
        //it is for annotation based when we are creating own config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("this is your object \n"+context);
        CartService service = context.getBean("cartService1", CartService.class);
        service.applyCart();
        System.out.println("***************************");
        UserService userService = context.getBean(UserService.class);
        userService.addUser();
        System.out.println("***************************");
        OrderService orderService = context.getBean(OrderService.class);
        orderService.orderStatus();
        //it is for xml based configuration
//        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext();

    }
}
