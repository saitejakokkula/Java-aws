package com.ByUsingBean.Annotation19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//@Component
public class Teamlead {
	
	@Autowired
	private Devloper dev;
	
	
	
	
	
	public void dowork()
	{
		System.out.println("Start the Teamlead Work");
		dev.dowork();
		System.out.println("End the Teamlead Work");
	}

}
