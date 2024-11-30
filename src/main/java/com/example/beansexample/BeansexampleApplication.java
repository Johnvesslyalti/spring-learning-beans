package com.example.beansexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeansexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeansexampleApplication.class, args);
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Institute institute = (Institute) context.getBean("instituteBean");
		
		institute.displayDetails();
	}

}
