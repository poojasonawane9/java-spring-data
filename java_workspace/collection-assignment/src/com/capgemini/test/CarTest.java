package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.Car;


public class CarTest {

	private static Car suzuki;
	private static Car Tavera;
	private static Car nano;

	@BeforeClass
	public static void setUp() {
		suzuki = new Car("TaTa","Zensar",2000,350000);
		Tavera = new Car("Mahindra","Fisa",2010,450000);
		nano = new Car("TaTa","Zensar",2000,350000);
		
	}
	
	@Test
	public void testDifferentCarArrayData() {
		ArrayList<Car> cars= new ArrayList<Car>();
		cars.add(suzuki);
		cars.add(Tavera);
		cars.add(nano);
		
		Iterator<Car> iterator = cars.iterator();
		assertEquals(suzuki, iterator.next());
		assertEquals(Tavera, iterator.next());
		assertEquals(nano, iterator.next());
	}
	
	@Test
	public void testTotalNumberOfCarObject() {
		HashSet<Car> cars = new HashSet<Car>();
		cars.add(suzuki);
		cars.add(Tavera);
		cars.add(nano);
		
		assertEquals(2, cars.size());
	}
	
	@Test
	public void testEqualityOfModel() {
		TreeSet<Car> car = new TreeSet<Car>();
		car.add(suzuki);
		car.add(Tavera);
		car.add(nano);
		
		Iterator<Car> iterator = car.iterator();
		assertEquals("Mahindra", iterator.next().getMake());
		assertEquals("TaTa", iterator.next().getMake());
				
	}

}
