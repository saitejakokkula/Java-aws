package com.ByUsingBean.Annotation19;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*	Controller is used for only user defined Clases.
 * 
 * When i say application Context it will create an Object and it refers to on.
 * 
 * --> AnnotationConfigApplicationContext it what will do means it will read that Class Annotations.
 * 
 * -->In we given Class names that Class names is also a reference names.
 * 
 * --> it these motive is we want to create Objects For pre-definned Classeses by using @bean Annotation.
 * 
 * --> When ever i call context Object it will be read particular bean. it will create an Object to Container.
 */
public class Testinggg {

	public static void main(String[] args) {
		
		ApplicationContext on =  new AnnotationConfigApplicationContext(GetConfiguration.class);
		
		
					Manager men	=	on.getBean(Manager.class);
					
					men.dowork();
					
					System.out.println("--------------------------");
					String   data	=	on.getBean(String.class);
					
					System.out.println(data);
					
					System.out.println("--------------------------");
					
					
					ArrayList<String> devv = on.getBean(ArrayList.class);
					
					System.out.println(devv);
					
					System.out.println("---------------------");
	
	}

}
