package com.bean.lifecycle;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("testBean.xml");
		StudentDAO s = context.getBean("studentDAO" , StudentDAO.class);
		s.selectAllRows();
		
		((ClassPathXmlApplicationContext)(context)).registerShutdownHook();
//		((ClassPathXmlApplicationContext)(context)).close();
	}
}
