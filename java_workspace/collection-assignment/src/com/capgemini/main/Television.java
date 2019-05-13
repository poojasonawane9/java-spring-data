package com.capgemini.main;

import java.util.Objects;

public class Television {

	private String company;
	private String type;
	private boolean enabled_3D;
	private int price;
	
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Television(String company, String type, boolean enabled_3d, int price) {
		super();
		this.company = company;
		this.type = type;
		this.enabled_3D = enabled_3d;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean getEnabled_3D() {
		return enabled_3D;
	}

	public void setEnabled_3D(boolean enabled_3d) {
		enabled_3D = enabled_3d;
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
		if(!(obj instanceof Television))
			return false;
		if(obj == this)
			return true;
		Television television = (Television) obj;
		if(company == television.company && type == television.type && price == television.price)
			return true;
		else
			return false;
	}
	
	public int hashCode() {
		return Objects.hash(company,type,price);
	}
	
	
	

}
