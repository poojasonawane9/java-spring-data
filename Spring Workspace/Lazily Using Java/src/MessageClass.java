package com.capgemini.spring.test;
import org.springframework.context.ApplicationContext;
import com.capgemini.spring.config.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.spring.renderer.MessageRenderer;

public class MessageClass{
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorConfigurationUsingJava.class");

		//MessageRenderer renderer = (MessageRenderer)context.getBean(MessageRenderer.class);
		//renderer.render();
	}
} 