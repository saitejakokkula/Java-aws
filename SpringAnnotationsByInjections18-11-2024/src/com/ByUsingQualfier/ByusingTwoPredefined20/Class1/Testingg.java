package com.ByUsingQualfier.ByusingTwoPredefined20.Class1;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testingg {

	/*Here i want to solve two Same type objects is not taking @bean to solve this 
	 * i use like this ---> ((String) on.getBean("getdata"); ). to solve this issue me must
	 * 	and give type casting.
	 * 
	 * -->
	 * 
	 * 
	 */
	public static void main(String[] args)
	{
		
		
		
		ApplicationContext on = new AnnotationConfigApplicationContext(getConfiguration.class);
		
				
					String sa		=  (String) on.getBean("getdata");
					
					System.out.println(sa);
					
					
					String saa		=  (String) on.getBean("getdataone");
					
					System.out.println(saa);
					
					
					System.out.println("---------------------------------");
					
					
					ArrayList<String> Aa =(ArrayList<String>) on.getBean("Arrayone");	
					
					System.out.println(Aa);

	}

}
