package com.slokam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// user find only used component 
@Component
public class manager {
	
	@Autowired  
	private teamlead t1;
	
	public void dowork() {
		
		System.out.println("manager work is started");
		t1.workdone();
		System.out.println("manager work is completed");
		
	}

}
