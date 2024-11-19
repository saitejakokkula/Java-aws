package com.Annotation18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testing {

	public static void main(String[] args) 
	{
		
		ApplicationContext on =new AnnotationConfigApplicationContext(getConfiguration.class);
		
			Manager mrr	= on.getBean(Manager.class);
			
			mrr.dowork();
		
		

	}

}
