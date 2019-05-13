package com.capgemini.trainingapp.main;

public class CorporateTraining extends Training {
	
	private int days;
	

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public CorporateTraining() {
		super();
		
	}

	public CorporateTraining(long id, String subject, double fees,int days) {
		super(id, subject, fees);
		this.days=days;
		
	}

	public CorporateTraining(int days) {
		super();
		this.days = days;
	}

	@Override
	public double getOrderValue() {
		return getFees() * days;
		
	}

}
