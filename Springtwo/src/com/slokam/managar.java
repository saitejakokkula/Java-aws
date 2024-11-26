package com.slokam;

public class managar {

	
	private teamlead t1;

	public managar(teamlead t1) {
		super();
		this.t1 = t1;
	}

	public void workdone() {
		System.out.println("managar work is started");
		t1.workdone();
		System.out.println("managar work is complete");
	}
		
	
}
