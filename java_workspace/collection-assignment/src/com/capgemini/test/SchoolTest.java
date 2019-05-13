package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.BeforeClass;
import org.junit.Test;
import com.capgemini.main.School;

public class SchoolTest {

	private static School kes;
	private static School xeviars;
	private static School kanya;
	
	@BeforeClass
	public static void setUp() {
		kes = new School("KES","Mahad","Raigad",1);
		xeviars =  new School("Xeviers","Mangaon","Nashik",3);
		kanya =  new School("Kany","Solapur","Minapur",2);
	}
	
	@Test
	public void testDifferentLaptopArrayData() {
		ArrayList<School> school = new ArrayList<School>();
		school.add(kes);
		school.add(xeviars);
		school.add(kanya);
		
		Iterator<School> iterator = school.iterator();
		assertEquals(kes, iterator.next());
		assertEquals(xeviars, iterator.next());
		assertEquals(kanya, iterator.next());
	}
}

