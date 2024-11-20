package com.ByUsingQualfier.ByusingTwoPredefined20.Class1;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ByUsingQualfier.ByusingTwoPredefined20.Class1")
public class getConfiguration
{
	
	//It will use user defined and pre-defined //
	@Bean
	public String getdata()
	{
		String s;
		
		s = new String("Slokammm");
		
		return s;
	}
	
	
	@Bean
	public String getdataone()
	{
		String s;
		
		s = new String("sr nagar");
		
		return s;
	}
	
	//----------------------------------------------------//
	
	//Now i am ussing array list //
	public ArrayList<String>  Arrayone()
	{
		ArrayList<String> a = new ArrayList<>();
		
		a.add("Devaa");
		a.add("Naveen");
		a.add("Yohin");
		
		return a;
	}
	
	
	

	public ArrayList<String>  ArrayTwo()
	{
		ArrayList<String> a = new ArrayList<>();
		
		a.add("One");
		a.add("Two");
		a.add("Three");
		
		return a;
	}
	//----------------------------------------------------------//
	
	
	
	
	
	
	
	
	
	

}
