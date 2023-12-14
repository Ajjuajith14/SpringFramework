package DepInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan("DepInjection")
public class DepInject
{
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext
                        (DepInject.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
