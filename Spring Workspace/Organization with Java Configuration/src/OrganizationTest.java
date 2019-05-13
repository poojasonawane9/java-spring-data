package com.capgemini.spring.test;

import com.capgemini.spring.main.*;
import com.capgemini.spring.configuration.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class OrganizationTest{
	public static void main(String[] args){
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

    		Organization org = (Organization)context.getBean("organization");
 
		System.out.println(org);
	}
} 