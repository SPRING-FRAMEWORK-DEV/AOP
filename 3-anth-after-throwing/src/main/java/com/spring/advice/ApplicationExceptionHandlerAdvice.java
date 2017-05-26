package com.spring.advice;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.spring.exceptions.UserNotFoundException;
import com.spring.exceptions.UserRegistrationFailedException;

@Aspect
@Component
public class ApplicationExceptionHandlerAdvice {

	
	@AfterThrowing(value="execution(* com.spring.beans.*.findUser(..))",throwing="unfe")
	public void userNotFoundExceptionHandler(JoinPoint jp,UserNotFoundException unfe)
	{
		System.out.println("User Friendly Message: "+unfe.getMessage());
		System.out.println("Cause of exception: "+unfe.getCause());
	}
	
	@AfterThrowing(value="execution(* com.spring.beans.*.registerUser(..))",throwing="urfe")
	public void userRegistrationFailedExceptionHandler(JoinPoint jp,UserRegistrationFailedException urfe)
	{
		System.out.println("User Friendly Message: "+urfe.getMessage());
		System.out.println("Cause of exception: "+urfe.getCause());
	}
	
	
}
