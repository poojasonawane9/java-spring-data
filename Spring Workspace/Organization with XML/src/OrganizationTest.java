package com.capgemini.spring.test;

import com.capgemini.spring.main.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class OrganizationTest{
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Organization orgnization = (Organization)context.getBean("orgnization");
		System.out.println(orgnization);
	}
} 