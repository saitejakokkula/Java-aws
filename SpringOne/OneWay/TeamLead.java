package com.cisco.OneWay;

public class TeamLead
{
	
	private Developer t1;

	
	public void setT1(Developer t1)
	{
		this.t1 = t1;
	}

	
	public void dowork()
	{
		System.out.println("Start the Developer Work");
		//It will go to developer class //
		t1.dowork();
		System.out.println("End the Developer Work");
	}

}
