
package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.UserManager;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = null;

		context = new AnnotationConfigApplicationContext("com.spring");
		
		UserManager um=context.getBean("userManager",UserManager.class);
		
		// case 1 : // it will throw UserNotFoundException
		    um.findUser(10);
		// case 2 : // it wont throw any exception
		  // um.findUser(101);
	
		// case 3: // it will throw exception
			//um.registerUser("rajesh", 12);
		// case 4 : // success
			//um.registerUser("rajesh", 21);
		
	}
	
	
}