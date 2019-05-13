package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import org.junit.BeforeClass;
import org.junit.Test;
import com.capgemini.main.CellPhone;
import com.capgemini.main.School;


public class CellPhoneTest {

	private static CellPhone mi;
	private static CellPhone nokia;
	private static CellPhone samsung;
	
	@BeforeClass
	public static void setUp() {
		mi = new CellPhone("mi","note 8","ram 2","mac",14000);
		nokia = new CellPhone("nokia","redmi 4","ram 4","android",15000);
		samsung =  new CellPhone("mi","note 8","ram 8","mac",16000);
	}
	
	@Test
	public void testDifferentLaptopArrayData() {
		ArrayList<CellPhone> school = new ArrayList<CellPhone>();
		school.add(mi);
		school.add(nokia);
		school.add(samsung);
		
		Iterator<CellPhone> iterator = school.iterator();
		assertEquals(mi, iterator.next());
		assertEquals(nokia, iterator.next());
		assertEquals(samsung, iterator.next());
	}
	
}
