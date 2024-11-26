package com.slokam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class teamlead {
	
	@Autowired
	private deveploer dev;
	
	public void workdone() {
		
		System.out.println("teamlead work is started");
		dev.dowork();
		System.out.println("teamlead work is completed");
		
	}

}
