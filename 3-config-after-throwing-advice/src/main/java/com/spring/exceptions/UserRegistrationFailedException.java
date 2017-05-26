package com.spring.exceptions;

public class UserRegistrationFailedException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7474236936254181399L;

	public UserRegistrationFailedException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
