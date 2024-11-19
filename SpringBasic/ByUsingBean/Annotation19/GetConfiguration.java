package com.ByUsingBean.Annotation19;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*	Here, i am creating a predefined Class.
 * 	
 * -->We are replacing Component means it will take only userdefined
 * --> Replacing i am using @Bean for predeined and user deined //
 */
@Configuration
@ComponentScan("com.ByUsingBean.Annotation19")
public class GetConfiguration 
{

	//By Using method i create a manager Object //
		@Bean
		public Manager manager()
		{
			return new Manager();
		}
	
	//------------------------------------------------//
	
	
		//By Using method i create a Teamlead Object //
				@Bean
				public Teamlead teamlead()
				{
					return new Teamlead();
				}
	
	
		//------------------------------------------------//
				
				
		//By Using method i create a Devloper Object //
				@Bean
				public Devloper devloper()
				{
					return new Devloper();
				}

				
	
	//--------------------------------------------------------//
	
	
	//Now we take an Arraylist //
	@Bean
	public ArrayList<String>  Arraylistone()
	{
		//We create an Object for Arraylist//
		ArrayList<String> a = new ArrayList<>();
		
		//Add each element to ArrayList 
		a.add("Deva");
		a.add("Raju");
		a.add("Pavan");
		
		//Return a
		return a;
	}
	
	//----------------------------------------------------------//
	
	/*
	@Bean
	public ArrayList<String>  Arraylisttwo()
	{
		//We create an Object for Arraylist//
		ArrayList<String> a = new ArrayList<>();
		
		//Add each element to ArrayList 
		a.add("One");
		a.add("Two");
		a.add("Three");
		
		//Return a
		return a;
	}
	
	*/
	
	
	//-------------------------------------------------------//
	
	
	//Taken a Return type method 
	//We Call @bean an Object is created 
	@Bean
	public String getname()
	{
		//Here taken only reference of String s
		String s;
		
		//Object is Created for string 
		s = new String("SLOKAM TECHNOLOGYS");
		
		//Return type 
			return s;
	}
	
	
	//-------------------------------------------------------------//
	
}
