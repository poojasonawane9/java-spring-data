package com.capgemini.spring.test;
import com.capgemini.spring.provider.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capgemini.spring.renderer.MessageRenderer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionUsingAnnotationTest{

	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		MessageRenderer renderer = (MessageRenderer)context.getBean("renderer");
		renderer.render();
	}
}