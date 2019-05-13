package com.capgemini.spring.aspects;
import org.springframework.stereotype.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.AfterThrowing; 
import org.aspectj.lang.*;
import com.capgemini.spring.math.*;

@Component
@Aspect
public class Validation{

	
	@Around("execution(* com.capgemini.spring.math.Calculator.divide(..))")
	public void validateDivide(ProceedingJoinPoint pjp)throws Throwable
	{
		Object[] args=pjp.getArgs();
		double firstArg=Double.parseDouble(args[0].toString());
		double secondArg=Double.parseDouble(args[1].toString());

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
	@AfterThrowing("execution(* com.capgemini.spring.math.Calculator.divide(..))")
	public void divideWithEception(){
		System.out.println("This is inside after throwing");
	}
}




