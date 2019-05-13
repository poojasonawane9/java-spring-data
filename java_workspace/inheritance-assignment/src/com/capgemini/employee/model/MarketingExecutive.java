package com.capgemini.employee.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MarketingExecutive extends Employee {

	private int kilometersTravelled;
	double tourAllowance;
	double telephoneAllowane;
	
	public MarketingExecutive() {
		super();
	}
	
	public MarketingExecutive(int employeeId,String employeeName,double basicSalary,double medical, int kilometersTravelled) {
		super(employeeId, employeeName, basicSalary, medical);
		this.kilometersTravelled=kilometersTravelled;
	}
	
	public int getKilometersTravelled() {
		return kilometersTravelled;
	}

	public void setKilometersTravelled(int kilometersTravelled) {
		this.kilometersTravelled = kilometersTravelled;
	}

	public double calculateGrossSalary() {
		tourAllowance = kilometersTravelled * 5.0;
		telephoneAllowane = 1500.0;
		return super.calculateGrossSalary()+ (kilometersTravelled + tourAllowance + telephoneAllowane);
	}
	
	
}
