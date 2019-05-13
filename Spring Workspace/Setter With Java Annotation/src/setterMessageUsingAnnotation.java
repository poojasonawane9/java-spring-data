package com.capgemini.spring.annotation;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.renderer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class setterMessageUsingAnnotation{

	@Bean
	public MessageProvider provider(){
		return new HelloWorldMessageProvider();
	}

	@Bean
	public MessageRenderer renderer(){
		MessageRenderer renderer = new MessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
	}



}