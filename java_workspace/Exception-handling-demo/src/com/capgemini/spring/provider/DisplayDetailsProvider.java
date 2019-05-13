package com.capgemini.spring.provider;

public class DisplayDetailsProvider {

	public String name;
	public String country;

	public DisplayDetailsProvider(){
	}
	
	public DisplayDetailsProvider(String name,String country){
		this.name = name;
		this.country = country;
	}
	
	public String showData(){
		return "Name is "+this.name+ " and Country is" +this.country;
	}
}
