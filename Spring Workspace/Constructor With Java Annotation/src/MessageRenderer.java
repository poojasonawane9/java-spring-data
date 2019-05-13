package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.*;

public class MessageRenderer{
	
	private MessageProvider messageprovider;

	public MessageRenderer(MessageProvider messageProvider){
		this.messageprovider = messageProvider;
	}	

	//public void setMessageProvider(MessageProvider provider){
	//	this.provider=provider;
	//}

	public void render(){
		System.out.println(messageprovider.getMessage());
	}
}