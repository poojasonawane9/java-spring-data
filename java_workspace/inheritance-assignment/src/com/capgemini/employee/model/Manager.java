package com.capgemini.employee.model;

public class Manager extends Employee{
	
	double petrolAllowance;
	double foodAllowance;
	double otherAllowance;
	double grossSalary;
	double netSalary;
	

	public Manager(){
		super();
	}
	
	public Manager(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId, employeeName, basicSalary, medical);
	}
	
	public double calculateGrossSalary() {
		petrolAllowance = 0.08 * getBasicSalary();
		foodAllowance = 0.13 * getBasicSalary();
		otherAllowance = 0.03 * getBasicSalary();
		grossSalary= super.calculateGrossSalary()+petrolAllowance + foodAllowance + otherAllowance;
		return grossSalary;
	}
	
	public double calculateNetSalary() {
		double PT = 200;
		double pF = 0.12 * getBasicSalary();
		netSalary = this.grossSalary - (PT + pF);
		return netSalary;
	}

}
