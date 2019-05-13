package com.capgemini.spring.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DisplayDetailsTest {

	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("details.xml");
		
		DisplayDetailsRenderer renderer = (DisplayDetailsRenderer)context.getBean("provider");
		renderer.details();
	}
}
