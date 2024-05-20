package com.qualifire.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("humanheart")
	private Heart heart;

//	public Human() {
//
//	}
//
////	@Autowired
//	public Human(Heart heart) {
//		super();
//		this.heart = heart;
//	}
//	
////	@Autowired
////	@Qualifier("humanheart")
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//	}

	public void display() {
		heart.pump();
		System.out.println(heart.getNameOfAnimal());
		System.out.println(heart.getNoOfHeart());
	}
}
