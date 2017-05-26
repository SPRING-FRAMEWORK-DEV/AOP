package com.spring.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAdvice {

	// @AfterReturning(value="execution(* com.spring.beans.*.sum(..))",returning="retVal")
	public void log(JoinPoint pjp) throws Throwable {
		// TODO Auto-generated method stub
		Object ret = null;
		String methodName = null;
		Object[] args = null;
		String methodSignature = null;

		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();

		methodSignature = methodSignature(methodName, args);
		System.out.println("after returning: " + methodSignature);

	}

	//@After("execution(* com.spring.beans.*.*(..))")
	public void logInfo(JoinPoint pjp) throws Throwable {
		// TODO Auto-generated method stub
		Object ret = null;
		String methodName = null;
		Object[] args = null;
		String methodSignature = null;

		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();

		methodSignature = methodSignature(methodName, args);
		System.out.println("after : " + methodSignature);
		// return ret;
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
