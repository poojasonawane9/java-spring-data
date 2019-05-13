package com.capgemini.main;

import java.util.Objects;

public class CellPhone {

	private String comapny;
	private String model;
	private String description;
	private String operatingSystem;
	private int price;
	
	public CellPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CellPhone(String comapny, String model, String description, String operatingSystem, int price) {
		super();
		this.comapny = comapny;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}

	public String getComapny() {
		return comapny;
	}

	public void setComapny(String comapny) {
		this.comapny = comapny;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(!(obj instanceof Car))
			return false;
		if(obj == this)
			return true;
		CellPhone cellphone = (CellPhone) obj;
		if(comapny == cellphone.comapny && model == cellphone.model && operatingSystem == cellphone.operatingSystem)
			return true;
		else
			return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(comapny,model,operatingSystem);
	}

	
}
