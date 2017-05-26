
package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Calculator;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = null;

		context = new AnnotationConfigApplicationContext("com.spring");
		Calculator cal = context.getBean("calculator", Calculator.class);

		float sum = cal.sum(10, 20);

		System.out.println(sum);

		int mul = cal.div(10, 0);
		System.out.println(mul);
	}
	
	

}
