package com.capgemini.main;

import java.util.Objects;

public class Student implements Comparable<Student> {

	private int studentId;
	private String studentName;
	private int studentAge;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) 
			return false;
		if(!(obj instanceof Laptop))
			return false;
		if(obj == this)
			return true;
		Student student = (Student) obj;
		if(studentName == student.studentName)
			return true;
		else
			return false;
	}
	
	public int hashCode() {
		return Objects.hash(studentName);
	}

	public int compareTo(Student student) {
		return studentName.compareTo(student.studentName);
	}
	

}
