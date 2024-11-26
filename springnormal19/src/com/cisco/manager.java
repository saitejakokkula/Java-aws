package com.cisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class manager {
	
	@Autowired
	private teamlead t1;
	
	public void workdone() {
		
		System.out.println("manager work is started");
		t1.workdone();
		System.out.println("manager work is completed");
	}

}
