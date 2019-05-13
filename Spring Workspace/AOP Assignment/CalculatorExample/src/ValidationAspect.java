package com.capgemini.aspects;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.*;
import org.aspectj.lang.ProceedingJoinPoint;
import com.capgemini.math.*;

@Component
@Aspect
public class ValidationAspect{

	@Before("execution(* com.capgemini.math.Operation.add(..))")
	public void addWithBefore(){
		System.out.println("This is before annotation");
	}

	@After("execution(* com.capgemini.math.Operation.add(..))")
	public void addWithAfter(){
		System.out.println("This is after annotation");
	}

	@Around("execution(* com.capgemini.math.Operation.add(..))")
	public void addWithAround(ProceedingJoinPoint pjp)throws Throwable{
		Object[] arg= pjp.getArgs();
		int firstArg = Integer.parseInt(arg[0].toString());
		int secondArg = Integer.parseInt(arg[1].toString());
	if(firstArg > 0 && secondArg > 0){
		pjp.proceed();
	}
	else{
	System.out.println("Negative number not allowed");
	}
	System.out.println("Around annotation");
	}

	@Around("execution(* com.capgemini.math.Operation.divide(..))")
	public void divideWithAround(ProceedingJoinPoint pjp)throws Throwable{
		Object[] arg= pjp.getArgs();
		Double firstArg = Double.parseDouble(arg[0].toString());
		Double secondArg = Double.parseDouble(arg[1].toString());
	if(secondArg > 0){
		pjp.proceed();
	}
	else{
	System.out.println("Negative number not allowed");
	}
	System.out.println("Around annotation");
	}
}