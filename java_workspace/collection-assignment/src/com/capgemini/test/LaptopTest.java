package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.Laptop;

public class LaptopTest {

	private static Laptop dellLaptop;
	private static Laptop hpLaptop;
	private static Laptop acerlaptop;
	
	
	@BeforeClass
	public static void setUp() {
		dellLaptop = new Laptop("Dell","inspiron","windows 10","i5");
		hpLaptop =  new Laptop("hp","notebook","windows 8","i3");
		acerlaptop =  new Laptop("Dell","inspiron","windows 7","i7");
	}

	
	@Test
	public void testDifferentLaptopArrayData() {
		ArrayList<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(dellLaptop);
		laptops.add(hpLaptop);
		laptops.add(acerlaptop);
		
		Iterator<Laptop> iterator = laptops.iterator();
		assertEquals(dellLaptop, iterator.next());
		assertEquals(hpLaptop, iterator.next());
		assertEquals(acerlaptop, iterator.next());
	}
	
	@Test
	public void testTotalNumberOfLaptopObject() {
		HashSet<Laptop> laptops = new HashSet<Laptop>();
		laptops.add(dellLaptop);
		laptops.add(hpLaptop);
		laptops.add(acerlaptop);
		
		assertEquals(2, laptops.size());
		
	}
	
	@Test
	public void testEqualityOfModel() {
		TreeSet<Laptop> laptop = new TreeSet<>();
		laptop.add(dellLaptop);
		laptop.add(hpLaptop);
		laptop.add(acerlaptop);
		
		
		Iterator<Laptop> iterator = laptop.iterator();
		assertEquals("Dell", iterator.next().getCompanyName());
		assertEquals("hp", iterator.next().getCompanyName());
		
	
	}
}
