package com.cisco.OneWay;

public class Manager
{
	
	private TeamLead t1 ;
	
	
	public void setT1(TeamLead t1)
	{
		this.t1 = t1;
	}
	
	

	public void dowork()
	{
		System.out.println("Start the Manager Work");
		//It will go to Teamlead class //
		t1.dowork();
		System.out.println("End the Manager Work");
	}
	
	
	
	
	
	
	

}
