package com.capgemini.bankapp.aspects;

import org.springframework.stereotype.*;
import org.apache.log4j.*;
import com.capgemini.bankapp.dao.impl.*;
import org.aspectj.lang.annotation.*;

@Component
@Aspect
public class LoggingAspects{
	private Logger logger = Logger.getLogger(LoggingAspects.class);
	@After("execution(* com.capgemini.bankapp.service.impl.*(..))")
	public void log(){
		logger.info("Account Created Sucessfully");
	}
}