package com.ByusingQualifyAnnotationClass1;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ByusingQualifyAnnotationClass1")

public class getConfiguration 
{
	/*I am using here @Bean i will remove Component why means Components 
	 * 		Accepts Only User defined Ones .
	 * --> But Beans Accepts Both User and Pre-defined Ones also.
	 * 
	 */
	
	
	
	
	@Bean
	public Manager manager()
	{
		return new Manager();
	}
	
	
	@Bean
	public Teamlead teamlead()
	{
		return new Teamlead();
	}
	
	
	@Bean
	public Devloper devloperone()
	{
		return new Devloper();
	}
	
	
	
	
	//--------------------------------------------------//
	@Bean(name = "s1")
	public String string1()
	{
		String s;
		
		s= new String(" Slokam ");
		
		return s;
	}

	@Bean(name ="s2")
	public String string2()
	{
		String s;
		
		s= new String(" Technologies ");
		
		return s;
	}
	
	//----------------------------------------------//
	
	
	
	@Bean
	public ArrayList<String> array1()
	{
			ArrayList<String> a = new ArrayList<>();
		
		a.add("sai");
		a.add("sager");
		a.add("srujan");
		
		return a;
	}
	
	
	
	@Bean
	public ArrayList<String> array2()
	{
			ArrayList<String> a = new ArrayList<>();
		
		a.add("One");
		a.add("Two");
		a.add("Three");
		
		return a;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
