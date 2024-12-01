package com.cisco.OneWay;

public class Testing
{
		//Injection processs //
	
	public static void main(String[] args)
	{
	
		//Manager object is created//
		System.out.println("----Main Thread is started-----");
		Manager m = new Manager();
	
		TeamLead team = new TeamLead();
		//Team lead object is also created//
		m.setT1(team);
		
		//in manager class we give a teamlead ref based on ref we create a set method//
		//in set method me create object we are passing that object reference//
		
		Developer dev = new Developer();
		team.setT1(dev);
		
		//in Teamlead class we give a Develoepr ref based on ref we create a set method//
		//in set method me create object we are passing that object reference//
		
		m.dowork();
		//We call do work method it will go to manager to Teamlead and Teamlead to Developer //

		System.out.println("-----Main Thread Ended-----");
	}

}
