package com.Annotation18;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager
{
	@Autowired
	private Teamlead tl;
	
	
	public void dowork()
	{
		
		System.out.println("--The Manager Work is started---");
		tl.dowork();
		System.out.println("--The Manager Work is Ended---");
		
		
		
	}

}
