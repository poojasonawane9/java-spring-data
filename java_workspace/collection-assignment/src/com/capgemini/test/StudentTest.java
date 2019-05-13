package com.capgemini.test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;
import com.capgemini.main.Student;

public class StudentTest {

	private static Student john;
	private static Student bob;
	private static Student grant;
	
	@BeforeClass
	public static void setUp() {
		john= new Student(1,"john",23);
		bob= new Student(2,"bob",21);
		grant= new Student(3,"grant",22);
	}
	
	
	@Test
	public void testStudentsInSortedOrder() {
		TreeSet<Student> student = new TreeSet<Student>();
		student.add(john);
		student.add(bob);
		student.add(grant);
		
		Iterator<Student> iterator = student.iterator();
		assertEquals("bob", iterator.next().getStudentName());
		assertEquals("grant", iterator.next().getStudentName());
		assertEquals("john", iterator.next().getStudentName());
		
	}
	
	@Test
	public void testDispayStudentNameAndFruit() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put(john.getStudentName(), "Mango");
		map.put(bob.getStudentName(), "Grapes");
		map.put(grant.getStudentName(), "Apple");
	
		assertEquals("Mango",map.get(john.getStudentName()));
		assertEquals("Grapes", map.get(bob.getStudentName()));
		assertEquals("Apple", map.get(grant.getStudentName()));
	
		Iterator<Map.Entry<String, String>> iterator= map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> entry= (Map.Entry<String,String>)iterator.next();
			assertEquals(true, map.containsKey(john.getStudentName()));
			assertEquals(true, map.containsKey(bob.getStudentName()));
			assertEquals(true, map.containsKey(grant.getStudentName()));
			assertEquals(true, map.containsValue("Mango"));
			assertEquals(true, map.containsValue("Grapes"));
			assertEquals(true, map.containsValue("Apple"));
		}
	}

	
	
	

}
