package com.spring.advice;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.spring.exceptions.UserNotFoundException;
import com.spring.exceptions.UserRegistrationFailedException;


public class ApplicationExceptionHandlerAdvice {

	
	public void userNotFoundExceptionHandler(JoinPoint jp,UserNotFoundException unfe)
	{
		System.out.println("User Friendly Message: "+unfe.getMessage());
		System.out.println("Cause of exception: "+unfe.getCause());
	}
	
	public void userRegistrationFailedExceptionHandler(JoinPoint jp,UserRegistrationFailedException urfe)
	{
		System.out.println("User Friendly Message: "+urfe.getMessage());
		System.out.println("Cause of exception: "+urfe.getCause());
	}
	
	
}
