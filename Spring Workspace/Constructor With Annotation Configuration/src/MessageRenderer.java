package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renderer")
public class MessageRenderer{
	
	private MessageProvider messageprovider;

	@Autowired
	public MessageRenderer(MessageProvider messageProvider){
		this.messageprovider = messageProvider;
	}	

	public void render(){
		System.out.println(messageprovider.getMessage());
	}
}