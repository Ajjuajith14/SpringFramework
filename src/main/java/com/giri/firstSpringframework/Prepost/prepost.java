package com.giri.firstSpringframework.Prepost;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class Someclass{
	
	private Dependency dependency;
	
	public Someclass(Dependency dependency)
	{
		super();
		this.dependency = dependency;
		System.out.println("All Dependencies are ready!");
	}
	
	@PostConstruct
	public void init()
	{
		Dependency.getReady();
	}
	
	@PreDestroy
	public void clean()
	{
		System.out.println("CleanUp");
	}
	
}

@Component
class Dependency{

	public static void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Method Running after Dependency ");
		
	}
	
}
@Configuration
@ComponentScan
public class prepost{
	
	public static void main(String[] args)
	{
		try(var context = 
				new AnnotationConfigApplicationContext
				(prepost.class))
		{
			Arrays.stream(context.getBeanDefinitionNames()).
			forEach(System.out::println);
		}
	}
}
