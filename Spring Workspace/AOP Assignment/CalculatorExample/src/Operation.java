package com.capgemini.math;

public class Operation implements Calculator{
	public void add(int number1,int number2){
		System.out.println(number1+number2);
	}
	
	public void divide(Double number1,Double number2){
		System.out.println(number1/number2);
	}
}