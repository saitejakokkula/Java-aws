package com.cisco.TwoWay;

public class TeamLead
{

	//Developer objectbis cretaed //
	private Developer t1 = new Developer();
	
	
	
	
	public void dowork()
	{
		System.out.println("---TeamLead task is started---");
		//it will go to develoeper class //
		t1.dowork();
		System.out.println("---TeamLead task is Ended---");
	}
	
	
}
