package com.spring.bean.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public abstract class School {
	
	@Autowired
	private Student student; //prototype

	public School() {
		System.out.println("School object got created");
	}
	
//	@Lookup
//	abstract Student createStudentobj() ;
		
	
	
//	@Lookup
//	Student createStudentobj() {
//		return null;
//	}
	
	/*
	   Student createStudentobj() {
		return context.getBean(Student.class);
	}
	 BTS the spring is going to this....spring will override the above method and give student object
	 */

//	public Student getStudent() {
//		Student student = createStudentobj();
//		return student;
//	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
}
