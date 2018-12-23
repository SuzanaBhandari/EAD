package com.studentinfo.services;

import java.sql.Timestamp;
import com.studentinfo.utils.*;


public class StudentServices {
	
	String name;
	FileLogger fileLogger = new FileLogger();
	DatabaseLogger databaseLogger = new DatabaseLogger();
	SessionLogger sessionLogger = new SessionLogger();
	

	public void createStudent(String name)
	{

		this.name = name;
		
		System.out.println("StudentServices: method createStudent(): student with name " + this.name + " created!");
		fileLogger.logInto(new Timestamp(System.currentTimeMillis()), this.name);
		databaseLogger.logInto(new Timestamp(System.currentTimeMillis()), this.name);
		sessionLogger.logInto(new Timestamp(System.currentTimeMillis()), this.name); //student.name
		
	}
	
	public void updateStudent(String name)
	{
		System.out.println("StudentServices: method updateStudent(): student with old name  " + this.name + " updated to " + name +"!");
		
	
		this.name = name;
		
		fileLogger.logInto(new Timestamp(System.currentTimeMillis()), this.name);
		databaseLogger.logInto(new Timestamp(System.currentTimeMillis()), this.name);
		sessionLogger.logInto(new Timestamp(System.currentTimeMillis()), this.name);
	}
	public void deleteStudent()
	{
		System.out.println("StudentServices: method deleteStudent(): student with name  " + this.name + " is deleted!");
		fileLogger.logInto(new Timestamp(System.currentTimeMillis()), this.name);
		databaseLogger.logInto(new Timestamp(System.currentTimeMillis()), this.name);
		sessionLogger.logInto(new Timestamp(System.currentTimeMillis()), this.name);
		
	
		this.name = "";
		
	}
	public static void main(String[] args)
	{
		
		StudentServices studentService = new StudentServices();
		
		studentService.createStudent("Sujana");
		
		
	}
	
}

