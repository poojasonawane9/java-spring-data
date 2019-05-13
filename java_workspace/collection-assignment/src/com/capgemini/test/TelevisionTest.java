package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.Television;

public class TelevisionTest {

	private static Television videocon;
	private static Television lg;
	private static Television whirlpool;
	
	@BeforeClass
	public static void setUp() {
		videocon = new Television("Videocon","LCD",true,18000);
		lg = new Television("Lg","LED",false,15000);
		whirlpool =  new Television("Lg","LED",true,15000);
	}
	
	@Test
	public void testDifferentLaptopArrayData() {
		ArrayList<Television> television = new ArrayList<Television>();
		television.add(videocon);
		television.add(lg);
		television.add(whirlpool);
		
		Iterator<Television> iterator = television.iterator();
		assertEquals(videocon, iterator.next());
		assertEquals(lg, iterator.next());
		assertEquals(whirlpool, iterator.next());
	}
	
	@Test
	public void testTotalNumberOfLaptopObject() {
		HashSet<Television> televisions = new HashSet<Television>();
		televisions.add(videocon);
		televisions.add(lg);
		televisions.add(whirlpool);
		
		assertEquals(2, televisions.size());
	}
}
