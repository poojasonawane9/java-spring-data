package com.capgemini.employee.model;

public class Employee {

	private int employeeId;
	private String employeeName;
	private  double basicSalary;
	private double medical;
	private double netSalary;
	private double grossSalary;
	public int PT = 200;
	
	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public Employee() {
		super();
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(long basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(long medical) {
		this.medical = medical;
	}

	public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}

	public double calculateGrossSalary() {
		double hra = 0.5 * basicSalary;
		grossSalary = basicSalary + hra + medical;
		return grossSalary;
		
	}

	public double calculateNetSalary() {
		double PF = 0.12 * basicSalary;
		netSalary = getGrossSalary() - (PF + PT);
		return netSalary;
	}	
	
}
