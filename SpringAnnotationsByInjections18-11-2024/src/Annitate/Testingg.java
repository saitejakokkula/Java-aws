package Annitate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testingg {

	public static void main(String[] args)
	{
		
		ApplicationContext on = new AnnotationConfigApplicationContext(getConfigaration.class);
		
			Manager  man  =  on.getBean(Manager.class);
			
			man.dowork();
		
	}

}
