package com.annotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AnnotationsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AnnotationsApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(ClassConfig.class);
		College college = context.getBean("college" , College.class);
//		System.out.println("the college object created by spring " + college);
		college.text();
		((AnnotationConfigApplicationContext)context).close();
	}

}
