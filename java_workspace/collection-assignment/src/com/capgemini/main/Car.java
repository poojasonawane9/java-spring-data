package com.capgemini.main;

import java.util.Objects;

public class Car implements Comparable<Car> {

	private String make;
	private String model;
	private int year;
	private double price;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(!(obj instanceof Car))
			return false;
		if(obj == this)
			return true;
		Car car = (Car) obj;
		if(make == car.make && model == car.model)
			return true;
		else
			return false;
	}
	
	public int hashCode() {
		return Objects.hash(make,model,price,year);
	}

	public int compareTo(Car car) {
		return make.compareTo(car.make);
	}
	
}
