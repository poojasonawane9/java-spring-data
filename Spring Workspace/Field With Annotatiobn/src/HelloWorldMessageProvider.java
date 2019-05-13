package com.capgemini.spring.provider;
import org.springframework.stereotype.Component;


public class HelloWorldMessageProvider implements MessageProvider{
	@Override
	public String getMessage(){
		return "Hello World";
	}
}