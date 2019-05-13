package com.capgemini.spring.test;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.config.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capgemini.spring.renderer.MessageRenderer;
//import com.capgemini.spring.annotated.MessageConfiguration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazilyInjectionUsingJavaTest{

	public static void main(String[] args){
		
		ApplicationContext context = new AnnotationConfigApplicationContext(LazilyConfigurationUsingJava.class);
		MessageRenderer renderer = (MessageRenderer) context.getBean(MessageRenderer.class);
		System.out.println(renderer.hashCode());
		MessageRenderer renderer1 = (MessageRenderer) context.getBean(MessageRenderer.class);
		System.out.println(renderer1.hashCode());
		renderer.render();
	}
}