package com.spring.beans;

import org.springframework.stereotype.Component;


public class Calculator {
	public float sum(int a,int b)
	{
		System.out.println("in add()");
		return a+b;
	}
	
	public int mul(int a,int b)
	{
		System.out.println("in mul()");
		return a*b;
	}
}
