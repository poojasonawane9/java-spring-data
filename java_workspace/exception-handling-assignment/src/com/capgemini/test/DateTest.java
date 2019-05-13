package com.capgemini.test;


import org.junit.Test;

import com.capgemini.exception.InvalidDayException;
import com.capgemini.exception.InvalidMonthException;
import com.capgemini.main.Date;

public class DateTest {
//
//	@Test
//	public void testDate() throws InvalidDayException, InvalidMonthException {
//		Date date = new Date(21,10,2014);
//		assertNotNull(date);
//	}
	
	Date date;
	@Test(expected=InvalidMonthException.class)
	public void testInvalidMonth() throws InvalidMonthException, InvalidDayException {
		 date = new Date(15,14,2014);
	
		
	}
//	
//	@Test(expected=InvalidDayException.class)
//	public void testInvalidDay() throws InvalidDayException, InvalidMonthException {
//		Date date = new Date(30,2,2014);
//		date.getDay();
//		
//	}

}
