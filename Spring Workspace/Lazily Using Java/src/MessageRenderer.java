package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.config.*;

public class MessageRenderer{
	
	private MessageProvider provider;

	{
		System.out.println("Object Created");
	}

	public MessageRenderer(MessageProvider provider){
		this.provider=provider;
	}
	
	//public void setMessageProvider(MessageProvider provider){
	//	this.provider=provider;
	//}

	public void render(){
		System.out.println(provider.getMessage());
	}
}