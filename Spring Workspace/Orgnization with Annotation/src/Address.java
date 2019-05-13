package com.capgemini.spring.main;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;

@Component
public class Address {
		
		@Value("Mahad")
		private String city;
		@Value("Maharashtra")
		private String state;
		@Value("402301")
		private int zipCode;
	
		
		@Override
		public String toString() {
			return "Address [city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
		}
}
