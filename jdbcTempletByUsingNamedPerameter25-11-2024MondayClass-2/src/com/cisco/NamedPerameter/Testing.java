package com.cisco.NamedPerameter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testing
{
	
	public static void main(String[] args)
	{
		
		
		ApplicationContext on = new AnnotationConfigApplicationContext(getConfiguration.class);
		
		
				Controller cc			 = on.getBean(Controller.class);
				
			//PersonPojo pp	=cc.save(new PersonPojo(21, "RAdha", 45, 87654, "sap"));
			
		//PersonPojo pp		= cc.update(25,12345,21);
				
				
		//	System.out.println("This is Return Back"+pp);
				
				cc.delete(21);
				System.out.println("It is deleted Succefully ");
	}

}
