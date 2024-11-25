package com.cisco.BatchUpdate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testing
{

	public static void main(String[] args)
	{
		
		
		ApplicationContext on = new AnnotationConfigApplicationContext(getConfiguration.class);
		
				Controller cc			=on.getBean(Controller.class);
				
				cc.saveBatchinfo();

	}

}
