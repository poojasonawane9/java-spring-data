package com.capgemini.spring.config;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.renderer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Configuration;

@Lazy
@Configuration
public class LazilyConfigurationUsingJava{

	@Bean
	public MessageRenderer getRenderer(){
		return new MessageRenderer(new HelloWorldMessageProvider());
	}

}