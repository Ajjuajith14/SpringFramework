package com.giri.firstSpringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address)  { };

record Address(String firstLine, String city) { };
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public int age(){
        return 21;
    }

    @Bean
    public String name(){
        return "VIKRAM";
    }

    @Bean
    @Primary
    public Person person()
    {
        return new Person("Harris", 19, new Address("213 West Street", "London"));

    }

    @Bean
    public Person person2MethodCall()
    {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person5Qualifer(String name, int age, @Qualifier("address3Qualifer") Address address)
    {
        return new Person(name,age,address);
    }




    @Bean(name = "address2")
    @Primary
    public Address address()
    {
        return new Address("Baker Street", "Manchester");

    }

    @Bean(name = "address3")
    @Qualifier("address3Qualifer")
    public Address address3()
    {
        return new Address("32 East Street", "Oval");
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3)
    {
        return new Person(name, age, address());

    }


}
