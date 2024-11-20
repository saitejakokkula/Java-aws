package com.SpringWithjdbcClass2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testing
{
	
	
	public static void main(String[] args)
	{
		
		
		System.out.println("---Start---");
		ApplicationContext on = new AnnotationConfigApplicationContext(GetConfigurationOne.class);
		
		Controller ca	=	on.getBean(Controller.class);
		
		ca.dowork();
		
		System.out.println("---Ended---");
		
	}
	
	
	
	}


