package com.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	public float sum(int a,int b)
	{
		System.out.println("in add()");
		return a+b;
	}
	
	public int div(int a,int b)
	{
		System.out.println("in mul()");
		if(b==0)
			throw new RuntimeException("b shouldnt be 0");
		return a*b;
	}
}
