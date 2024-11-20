package com.ByUsingQualfier.ByusingTwoPredefined20.Class1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teamlead {
	
	@Autowired
	private Devloper dev;
	
	
	
	public void dowork()
	{
		
		System.out.println("start the manager");
		dev.dowork();
		System.out.println("End the Manager");
		
	}


}
