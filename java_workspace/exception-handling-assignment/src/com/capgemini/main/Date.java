package com.capgemini.main;


import com.capgemini.exception.InvalidDayException;
import com.capgemini.exception.InvalidMonthException;


public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date(int day, int month, int year) throws InvalidDayException, InvalidMonthException {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		
		if(this.month == 2) {
			if(this.day < 29 && this.day > 0)
				this.day=day;
			else
				throw new InvalidDayException("Not valid input");
		}
		else if(this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 9 || this.month == 11) {
			if(this.day < 32 && this.day > 0)
				this.day = day;
			else
				throw new InvalidDayException("Invalid input");
		}
		if(this.month == 4 || this.month == 6 || this.month == 8  && this.month == 10 || this.month == 12)
			if(this.day < 31 && this.day > 0)
				this.day = day;
		else
			throw new InvalidDayException("Invalid input");
		if(this.month > 12 && this.month < 1)
			throw new InvalidMonthException("invalid");
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
//
//	public void checkValidDay() throws InvalidDayException {
//		if(day >= 1 && day <=31) {
//			System.out.println("Valid date");
//		}
//		else {
//			throw new InvalidDayException("Invalid day");
//		}
//		
//	}
//
//	public void checkInvalidMonth() throws InvalidMonthException {
//		
//		if(month >= 1 && month <= 12) {
//			System.out.println("Valid month");
//		}
//		else {
//			throw new InvalidMonthException("Invalid month");
//			}
//		}
	
		
	}
