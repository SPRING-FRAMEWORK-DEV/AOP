package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Calculator;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = null;

		context = new ClassPathXmlApplicationContext("com/spring/config/applicationContext.xml");
		Calculator cal = context.getBean("calculator", Calculator.class);

		float sum = cal.sum(10, 20);

		System.out.println(sum);

		int mul = cal.mul(10, 20);
		System.out.println(mul);
	}

}
/*
 * Entering into: sum(10,20) in add() Existing From: sum(10,20) with return
 * value: 30 30 Entering into: mul(10,20) in mul() Existing From: mul(10,20)
 * with return value: 200 200
 */