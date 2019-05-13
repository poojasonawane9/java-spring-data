package com.capgemini.spring.annotation;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.renderer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConstructorConfigurationUsingJava{

	@Bean
	public MessageRenderer getRenderer(){
		return new MessageRenderer(new HelloWorldMessageProvider());
	}

}