package com.cisco.TwoWay;

public class Manager
{
	// Here team lead object is created //
	private TeamLead t1 = new TeamLead();
	
	
	public void dowork()
	{
		
		System.out.println("---Manager task is started---");
		//Now it will go to teamlead Class //
		t1.dowork();
		System.out.println("---Manager task is Ended---");
	}
	
	
	
	
	
	
}
