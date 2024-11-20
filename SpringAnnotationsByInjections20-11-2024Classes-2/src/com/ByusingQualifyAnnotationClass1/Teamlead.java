package com.ByusingQualifyAnnotationClass1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Teamlead {
	
	
	@Autowired
	@Qualifier("devloperone")
	private Devloper dev;
	
	
	
	
	
	
	public void dowork()
	{
		System.out.println("Start from Teamlead class");
		dev.dowork();
		System.out.println("End from Teamlead class");
	}
	

}
