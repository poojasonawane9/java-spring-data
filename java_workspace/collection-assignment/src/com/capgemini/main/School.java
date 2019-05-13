package com.capgemini.main;

import java.util.Objects;

public class School {

	private String schoolName;
	private String schoolCity;
	private String schoolDistrict;
	private int greatSchoolRanking;
	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(String schoolName, String schoolCity, String schoolDistrict, int greatSchoolRanking) {
		super();
		this.schoolName = schoolName;
		this.schoolCity = schoolCity;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolCity() {
		return schoolCity;
	}

	public void setSchoolCity(String schoolCity) {
		this.schoolCity = schoolCity;
	}

	public String getSchoolDistrict() {
		return schoolDistrict;
	}

	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}

	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) 
			return false;
		if(!(obj instanceof School))
			return false;
		if(obj == this)
			return true;
		School school = (School) obj;
		if(schoolName == school.schoolName && schoolCity == school.schoolCity && schoolDistrict == school.schoolDistrict)
			return true;
		else
			return false;
	}
	
	public int hashCode() {
		return Objects.hash(schoolName,schoolCity,schoolDistrict);
	}


}
