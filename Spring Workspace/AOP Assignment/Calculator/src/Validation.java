package com.capgemini.spring.aspects;
import org.springframework.stereotype.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.*;
import com.capgemini.spring.math.*;

@Component
@Aspect
public class Validation{

	@Before("execution(* com.capgemini.spring.math.Calculator.add(..))")
	public void validate(JoinPoint jp) throws Throwable
	{
		System.out.println("This is inside add method using before advice");
	}


	@After("execution(* com.capgemini.spring.math.Calculator.add(..))")
	public void show()
	{
		System.out.println("This is inside add method using after advice");
	}

	
	@Around("execution(* com.capgemini.spring.math.Calculator.add(..))")
	public void validateAdd(ProceedingJoinPoint pjp ) throws Throwable
	{
		Object[] args=pjp.getArgs();
		int firstArg=Integer.parseInt(args[0].toString());
		int secondArg=Integer.parseInt(args[1].toString());
		if(firstArg>0 && secondArg>0)
		{
			pjp.proceed();
		}

		else
		{
			System.out.println("Negative nos. not allowed");
		}

		System.out.println("This is inside add method using around advice");
	}


	@Around("execution(* com.capgemini.spring.math.Calculator.divide(..))")
	public void validateDivide(ProceedingJoinPoint pjp ) throws Throwable
	{
		Object[] args=pjp.getArgs();
		double firstArg=Double.parseDouble(args[0].toString());
		double secondArg=Double.parseDouble(args[1].toString());
		if(secondArg!=0)
		{
			pjp.proceed();
		}
		else
		{
			System.out.println("Denominator can't be zero");
		}
	}

}



