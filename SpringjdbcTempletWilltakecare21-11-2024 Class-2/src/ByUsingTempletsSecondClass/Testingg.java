package ByUsingTempletsSecondClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testingg
{

	public static void main(String[] args)
	{
		System.out.println("--Started main method --");
		ApplicationContext on = new AnnotationConfigApplicationContext(GetConfiguration.class);
		
				Controller  cc	=  on.getBean(Controller.class);
				
			//cc.save(new StudentPojo(9, "Dhaaa", 27, "sap"));
				
				//cc.update(24, "nrt", 5);
				
				cc.delete(101);
				System.out.println("--Ended main method --");
				
				

	}

}
