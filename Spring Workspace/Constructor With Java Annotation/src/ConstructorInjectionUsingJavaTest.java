package com.capgemini.spring.test;
import com.capgemini.spring.annotation.ConstructorConfigurationUsingJava;
import com.capgemini.spring.provider.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capgemini.spring.renderer.MessageRenderer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionUsingJavaTest{

	public static void main(String[] args){
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConstructorConfigurationUsingJava.class);
		MessageRenderer renderer = (MessageRenderer) context.getBean(MessageRenderer.class);
		renderer.render();
	}
}