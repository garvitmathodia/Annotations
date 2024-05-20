package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Value("skit")
	private String collegeName;
	
	@Autowired
	private Principle principle;
	
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;

//	public College(Principle principle) {
//		this.principle = principle;
//	}
	
	
//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//	}

	public void text()
	{
		principle.principleInfo();
		teacher.teach();
		System.out.println(collegeName);
	}

	
//	public void setPrinciple(Principle principle) {
//		this.principle = principle;
//		System.out.println("setter injection");
//	}


}
