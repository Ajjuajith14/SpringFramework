package com.giri.firstSpringframework.helloworld;



import com.giri.firstSpringframework.helloworld.Address;
import com.giri.firstSpringframework.helloworld.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring
{
    public static void main(String[] args) {
        //1. Launch a Spring Context;
        var context =
                new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2. Configure the things that we want Spring to Manage -
        //HelloWorldConfiguration - @configuration
        //name - @Bean
        //age - @Bean
        //etc.....

        //3. Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("address2"));
        System.out.println(Person.class);
        System.out.println(Address.class);
        System.out.println(context.getBean("person5Qualifer"));



    }
}
