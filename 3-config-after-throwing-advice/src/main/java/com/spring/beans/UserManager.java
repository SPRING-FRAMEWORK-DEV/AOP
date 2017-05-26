package com.spring.beans;

import org.springframework.stereotype.Component;

import com.spring.exceptions.UserNotFoundException;
import com.spring.exceptions.UserRegistrationFailedException;

public class UserManager {

	public void findUser(int id) {
		if (id < 100)
			throw new RuntimeException(
					"User doesn't exists with id less than 100",
					new Throwable(
							"this will come at runtime from ur application"));

		else
			System.out.println("User exists with id: " + id);
	}
	
	public void registerUser(String name,int age)
	{
		
		if(age < 18)
			throw new UserRegistrationFailedException("Age should be more than 18", new Throwable("Some technica mesage you can write here"));
		else
		{
			System.out.println("registration success");
		}
	}
}
