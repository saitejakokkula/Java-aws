package com.ByUsingQualfier.ByusingTwoPredefined20.Class1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {
	
	
	@Autowired
	private Teamlead tl;
	

	public void dowork()
	{
		
		System.out.println("start the manager");
		tl.dowork();
		System.out.println("End the Manager");
		
	}

}
