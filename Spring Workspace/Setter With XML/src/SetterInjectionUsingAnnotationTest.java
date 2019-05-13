package com.capgemini.spring.test;
import com.capgemini.spring.annotation.setterMessageUsingAnnotation;
import com.capgemini.spring.provider.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capgemini.spring.renderer.MessageRenderer;
//import com.capgemini.spring.annotated.MessageConfiguration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionUsingAnnotationTest{

	public static void main(String[] args){
		
		ApplicationContext context = new AnnotationConfigApplicationContext(setterMessageUsingAnnotation.class);
		MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
		renderer.render();
	}
}