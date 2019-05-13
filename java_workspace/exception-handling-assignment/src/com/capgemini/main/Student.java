package com.capgemini.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.exception.AgeNotWithinRangeException;
import com.capgemini.exception.NameNotValidException;

public class Student  {

	private int rollNo;
	private String studentName;
	private int age;
	private String course;
	
	public Student() {
		
	}
	
	public Student(int rollNo,String studentName,int age,String course) throws AgeNotWithinRangeException {
		this.rollNo=rollNo;
		this.studentName = studentName;
		this.age = age;
		if(age >= 15 && age <=21) {
			System.out.println("Age is within specified range");
		}
		else
			throw new AgeNotWithinRangeException("Age not within range exception");
		this.course=course;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeNotWithinRangeException {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void checkAgeOfStudent() throws AgeNotWithinRangeException {
		if(age >= 15 && age <=21) {
			System.out.println("Age is within specified range");
		}
		else
			throw new AgeNotWithinRangeException("Age not within range exception");
		
	}

	public void checkNameOfTheStudent() throws NameNotValidException{
	      Pattern pattern = Pattern.compile("[a-zA-Z]*");
	      Matcher matcher = pattern.matcher(studentName);
	      if (matcher.matches()) {
	           System.out.println("string '"+studentName + "' doesn't contains special character");
	      } 
	      else {
	           throw new NameNotValidException("string '"+studentName + "' contains special character");
	      }
	}
	
	
	
	

}
