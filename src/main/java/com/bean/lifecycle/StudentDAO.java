package com.bean.lifecycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class StudentDAO {

	private String driver;
	private String url;
	private String username;
	private String password;
	
	Connection connection;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		System.out.println("setdriver");
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		System.out.println("seturl");
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		System.out.println("setusername");
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("setpassword");
		this.password = password;
	}
	
	@PostConstruct
	public void createStudentDBConnection()throws ClassNotFoundException, SQLException {
		System.out.println("inside init method");
		Class.forName(driver);

		connection = DriverManager.getConnection(url, username, password);

	}

	public void selectAllRows() throws ClassNotFoundException, SQLException {
		
		Statement stmt = connection.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM school.student");

		while (rs.next()) {
			int studentId = rs.getInt(1);
			String studentName = rs.getString(2);
			String studentAddress = rs.getString(3);
			System.out.println(studentId + "  " + studentName + "  " + studentAddress);
		}
		
	}

	public void deleteStudentRecord(int studentId) throws ClassNotFoundException, SQLException {

		Statement stmt = connection.createStatement();
		
		stmt.executeQuery("Delete from school.student where Roll_No "+ studentId);
		
		
		System.out.println("recored of student of "+ studentId + "has been deleted");
		
		
		
	}
	
	@PreDestroy
	public void closeConnection() throws SQLException {
		System.out.println("inside the destroy method");
		connection.close();
	}
}
