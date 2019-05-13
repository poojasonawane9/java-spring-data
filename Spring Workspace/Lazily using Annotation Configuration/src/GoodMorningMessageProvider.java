package com.capgemini.spring.provider;
import org.springframework.stereotype.Component;

@Component("GM")
public class GoodMorningMessageProvider implements MessageProvider{
	@Override
	public String getMessage(){
		return "Good Morning";
	}
}