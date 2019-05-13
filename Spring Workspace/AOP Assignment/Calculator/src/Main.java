package com.capgemini.spring.test;
import org.springframework.context.*;
import com.capgemini.spring.math.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.*;

public class Main
{
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Application  app =context.getBean(Application.class);
		app.add(-30,-20);
		app.divide(50.0,0.0);
	}
}