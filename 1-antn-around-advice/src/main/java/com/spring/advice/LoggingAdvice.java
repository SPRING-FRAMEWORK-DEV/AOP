package com.spring.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAdvice {

	@Around("execution(* com.spring.beans.*.sum(..))")
	public Object log(ProceedingJoinPoint pjp) throws Throwable {
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
		ret = pjp.proceed();
		System.out.println("Existing From: " + methodSignature
				+ " with return value: " + ret);
		return ret;
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
