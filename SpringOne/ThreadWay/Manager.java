package com.cisco.ThreadWay;

public class Manager
{

	
	private TeamLead t1 = null;
	
	
	
	public void dowork()
	{
		System.out.println("---Manager Task is started---");
		t1 = new TeamLead();
		t1.dowork();
		System.out.println("---Manager Task is ended---");
	}
	
	
	
}
