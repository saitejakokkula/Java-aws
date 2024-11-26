package com.cisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class teamlead {
	
	@Autowired
	@Qualifier("deveploer")
	private deveploer dev;
	
	public void workdone() {
		
		System.out.println("teamlead work is started");
		dev.workdone();
		System.out.println("teamlead work is completed");
	}

}
