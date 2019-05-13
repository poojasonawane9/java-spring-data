package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.DisplayDetailsProvider;

public class DisplayDetailsRenderer {

	private DisplayDetailsProvider provider;

	public DisplayDetailsRenderer(){
	}

	public DisplayDetailsRenderer(DisplayDetailsProvider provider){
		System.out.println("Inside Renederer Constructor");
		this.provider = provider;
	}
	public void details(){
		System.out.println(provider.showData());
	}
}
