package com.capgemini.spring.math;
import org.springframework.stereotype.*;

@Component
public class Calculator implements Application{

	/*@Override
	public void add(int num1,int num2)
	{
		 System.out.println(num1+num2);
	}*/

	@Override
	public void divide(double num1,double num2)
	{
		System.out.println(num1/num2);
	}

}