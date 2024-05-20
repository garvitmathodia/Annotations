package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{

	@Override
	public void teach() {
		System.out.println("i am your math teacher");
		
	}

}
