package com.cisco;

public class man {
	
	private teamlead t1;
	
	
	public void setT1(teamlead t1) {
		this.t1 = t1;
	}


	public void workdone() {
		
		System.out.println("manager work is started");
		t1.workdone();
		System.out.println("manager work is completed");
	}

}
