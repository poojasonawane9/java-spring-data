package com.capgemini.test;
import com.capgemini.math.Calculator;
import com.capgemini.math.Operation;
import com.capgemini.aspects.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Calculator calculator = context.getBean(Calculator.class);
		calculator.add(5,4);
		calculator.divide(10.0,5.0);
	}
} 