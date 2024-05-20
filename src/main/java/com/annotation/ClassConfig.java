package com.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.annotation")
public class ClassConfig {
//
//	@Bean
//	public Teacher mathTeacher() {
//		return new MathTeacher();
//	}
//
//	@Bean
//	public Principle principle() {
//		return new Principle();
//	}
//
//	@Bean
//	public College collegeBean() { // collegeBean - bean id
//		College college = new College();
//		college.setPrinciple(principle());
//		college.setTeacher(mathTeacher());
//		return college;
//	}
	
}
