package com.cisco;

public class teamlead {
	
	private deveploer dev1;
	
	
	
public void setDev1(deveploer dev1) {
		this.dev1 = dev1;
	}



public void workdone() {
		
		System.out.println("manager work is started");
		dev1.workdone();
		System.out.println("manager work is completed");
	}


}
