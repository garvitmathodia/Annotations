package com.dependency;

public class Student {

	private String Sname;

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}
	
	public void display() {
		System.out.println("student name is " + Sname);
	}
	
}
