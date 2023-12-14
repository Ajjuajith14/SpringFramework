package com.giri.firstSpringframework.DependencyInjection.a1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan

class YourBusinessClass
{
    @Autowired
    Dependency1 dependency1;

    @Autowired
    Dependency2 dependency2;

    @Override
    public String toString() {
        return "YourBusinessClass{" +
                "dependency1=" + dependency1 +
                ", dependency2=" + dependency2 +
                '}';
    }

    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        this.dependency1 = dependency1;
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        this.dependency2 = dependency2;
    }

    @Autowired
    //Might not need the Autowired for the Constructor
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }


}

@Component
class Dependency1
{

}

@Component
class Dependency2
{

}

public class DepInjection
{
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext
                        (DepInjection.class);

        Arrays.stream(context.getBeanDefinitionNames()).
                forEach(System.out::println);

        System.out.println(context.getBean(YourBusinessClass.class));
    }
}
