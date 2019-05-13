package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Qualifier;

@Service("renderer")
public class MessageRenderer{
	
	private MessageProvider provider;

	@Autowired
	@Qualifier("HW")
	public void setMessageProvider(MessageProvider provider){
		this.provider=provider;
	}

	public void render(){
		System.out.println(provider.getMessage());
	}
}