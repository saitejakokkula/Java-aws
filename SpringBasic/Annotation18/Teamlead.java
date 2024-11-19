package com.Annotation18;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teamlead 
{
	
	@Autowired
	private Develoeper dev;
	
	
	public void dowork()
	{
		
		System.out.println("--The Teamlead Work is started---");
		dev.dowork();
		System.out.println("--The Teamlead Work is Ended---");
		
		
		
	}
}
