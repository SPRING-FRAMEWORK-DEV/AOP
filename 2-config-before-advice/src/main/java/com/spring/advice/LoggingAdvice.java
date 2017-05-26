package com.spring.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


public class LoggingAdvice {

	public void log(JoinPoint pjp) throws Throwable {
		// TODO Auto-generated method stub
		Object ret = null;
		String methodName = null;
		Object[] args = null;
		String methodSignature = null;

		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();
		args[0]=2345;
	
		methodSignature = methodSignature(methodName, args);
		System.out.println("Entering  into: " + methodSignature);
		//ret = pjp.proceed();
		System.out.println("Existing From: " + methodSignature
				+ " with return value: " + ret);
		//return ret;
	}

	private String methodSignature(String methodName, Object[] args) {

		String methodSignature = null;
		boolean isFirst = true;
		StringBuffer sb = null;

		sb = new StringBuffer();

		sb.append(methodName).append("(");
		for (Object arg : args) {
			if (isFirst) {
				sb.append(arg.toString());
				isFirst = false;
				continue;
			}
			sb.append(",").append(arg.toString());
		}
		sb.append(")");
		methodSignature = sb.toString();
		return methodSignature;
	}

}
