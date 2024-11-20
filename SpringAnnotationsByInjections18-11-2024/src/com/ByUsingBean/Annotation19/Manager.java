package com.ByUsingBean.Annotation19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



//@Component
public class Manager
{

	
	@Autowired
	private Teamlead tl;
	
	
	public void dowork()
	{
		System.out.println("Start the Manager Work");
		tl.dowork();
		System.out.println("End the Manager Work");
	}
	
	
	
	
	
	
	
}
