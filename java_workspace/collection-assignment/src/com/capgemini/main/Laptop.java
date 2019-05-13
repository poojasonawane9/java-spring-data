package com.capgemini.main;

import java.util.Objects;

public class Laptop implements Comparable<Laptop> {
	
	private String companyName;
	private String model;
	private String operatingSystem;
	private String processor;
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Laptop(String companyName, String model, String operatingSystem, String processor) {
		super();
		this.companyName = companyName;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public boolean equals(Object obj) {
		if(obj == null) 
			return false;
		if(!(obj instanceof Laptop))
			return false;
		if(obj == this)
			return true;
		Laptop laptop = (Laptop) obj;
		if(companyName == laptop.companyName && model == laptop.model)
			return true;
		else
			return false;
	}
	
	public int hashCode() {
		return Objects.hash(companyName,model);
	}

	@Override
	public int compareTo(Laptop laptop) {
		return this.companyName.compareTo(companyName);
	}
	
}
