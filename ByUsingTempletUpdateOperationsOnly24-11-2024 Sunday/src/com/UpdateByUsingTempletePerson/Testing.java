package com.UpdateByUsingTempletePerson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testing
{

	
	public static void main(String[] args)
	{
		
		ApplicationContext  on = new AnnotationConfigApplicationContext(GetConfiguration.class);
		
								
					Controller    cc =	on.getBean(Controller.class);
				//	cc.Save(new PersonPojo(7, "Servan", 20, 98765, "hyd"));
					
					//cc.update(25, 12345,7);
					cc.delete(7);
	}
}
