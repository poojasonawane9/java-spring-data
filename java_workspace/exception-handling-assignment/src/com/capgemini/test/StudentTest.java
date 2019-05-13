package com.capgemini.test;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import com.capgemini.exception.AgeNotWithinRangeException;
import com.capgemini.exception.NameNotValidException;
import com.capgemini.main.Student;

public class StudentTest {

	@Test
	public void testStudentConstuctorCreated() {
		Student student = new Student();
		assertNotNull(student);
	}

	@Test(expected = AgeNotWithinRangeException.class)
	public void testStudentAge() throws AgeNotWithinRangeException {
		Student student = new Student(101, "John", 2, "Computer");
		student.checkAgeOfStudent();
	}
	
	@Test(expected = NameNotValidException.class)
	public void testStudentName() throws NameNotValidException, AgeNotWithinRangeException {
		Student student1=new Student(101, "Joh9n", 18, "Computer");
		student1.checkNameOfTheStudent();
	}

}
