package com.ByusingQualifyAnnotationClass1;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Testing 
{
	/*Error :- NoSuchBeanDefinitionException:
	 * --> This error Occured we didn"t keep @Bean this error Occurs.
	 * 
	 * 2) NoUniqueBeanDefinitionException :- 
	 * 		--> This error Occured we have to Strings it will go which side.
	 * 		--> Solving this one String   s2 = (String) on.getBean("string2");
	 * ---> We solve this way of type castingg.
	 * 
	 * 3)NoSuchBeanDefinitionException :-
	 * 		-->This error we give bean name it will come to @Bean(name = "s1") Spring
	 * 				Save name like s1 we wantbto call this s1 Only .
	 * 
	 * 4)BeanCreationException :- expected 
	 * single matching bean but found 2: devloper,devloperone
		at org.springframework.beans.factory.annotation.
		AutowiredAnnotationBeanPostProcessor.
		postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:334)
	 * 
	 * to solve thisberror new One is came is is Qualifier() 
	 * 	-> this Qualifier is i want to keep only One TEamlead Object Devloper properties.
	 */
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext on = new AnnotationConfigApplicationContext(getConfiguration.class);
		
			Manager men	= on.getBean(Manager.class);
			
			System.out.println(men);
			
			men.dowork();
			System.out.println("--------------------------");
		
			String   s1 = (String) on.getBean("s1");
			
			System.out.println(s1);
			
				String   s2 = (String) on.getBean("s2");
			
			System.out.println(s2);
			
			System.out.println("--------------------------");
			
			
				ArrayList<String> a = (ArrayList<String>) on.getBean("array1");
				
				System.out.println(a);
				
				
				ArrayList<String> a1 = (ArrayList<String>) on.getBean("array2");
				
				System.out.println(a1);
					
				System.out.println("--------------------------");
		
	}

}
