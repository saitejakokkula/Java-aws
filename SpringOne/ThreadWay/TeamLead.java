package com.cisco.ThreadWay;

public class TeamLead
{
	

	private Developer dev = null;
	
	
	public void dowork()
	{
		System.out.println("---TeamLead Task is started---");
		
		dev = new Developer();
		dev.dowork();
		
		System.out.println("---TeamLead Task is ended---");
	}
	
	

}
