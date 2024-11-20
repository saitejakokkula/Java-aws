package com.ByusingQualifyAnnotationClass1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Manager {
	
	
	@Autowired
	private Teamlead tl;
	
	public void dowork()
	{
		System.out.println("Start from Manager class");
		tl.dowork();
		System.out.println("End from Manager class");
	}
	
	
	
	
	

}
