package com.capgemini.trainingapp.main;

public class PublicTraining extends Training{

	private int participants;
	
	public PublicTraining() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PublicTraining(long id, String subject, double fees,int participants) {
		super(id, subject, fees);
		this.participants = participants;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}

	public PublicTraining(int participants) {
		super();
		this.participants = participants;
	}

	@Override

	public double getOrderValue() {
		return getFees()*participants;
	}
	
	
}
