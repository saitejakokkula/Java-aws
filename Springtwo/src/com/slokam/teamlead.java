package com.slokam;

public class teamlead {
	
	private deveploer dev;

	public teamlead(deveploer dev) {
		super();
		this.dev = dev;
	}
	
	public void workdone() {
		
		System.out.println("teamlead work is started");
		dev.workdone();
		System.out.println("teamlead work is completed");
	}

}
