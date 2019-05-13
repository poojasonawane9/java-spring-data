package com.capgemini.trainingapp.main;

public abstract class Training {

	private long id;
	private String subject;
	private double fees;
	
	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Training(long id, String subject, double fees) {
		super();
		this.id = id;
		this.subject = subject;
		this.fees = fees;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	
	public abstract double getOrderValue();
}
