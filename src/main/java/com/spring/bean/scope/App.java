package com.spring.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
//		SingletonDemo obj1 = context.getBean("singletonDemo" , SingletonDemo.class);
//		SingletonDemo obj2 = context.getBean("singletonDemo" , SingletonDemo.class);
//		
//		System.out.println(obj1 +"    "+obj2);
		
//		PrototypeDemo obj1 = context.getBean("prototypeDemo" , PrototypeDemo.class);
//		PrototypeDemo obj2 = context.getBean("prototypeDemo" , PrototypeDemo.class);
//		
//		System.out.println(obj1 +"    "+obj2);
		
//		School obj1 = context.getBean("school" , School.class);
		
//		System.out.println(obj1.getStudent());
//		System.out.println(obj1.getStudent()); //both will return the same student(prototype scope) object....
		
//		School obj1 = context.getBean("school" , School.class);
//		School obj2 = context.getBean("school" , School.class);
//		
//		System.out.println(obj1 +"    "+obj2);
		
	}
}
