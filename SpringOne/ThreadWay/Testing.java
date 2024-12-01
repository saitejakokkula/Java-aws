package com.cisco.ThreadWay;

public class Testing
{

	//Automatic Process //
	public static void main(String[] args)
	{
		System.out.println("---Main Thread Is started---");
		Manager mr = new Manager();
		//We create manager object it will go to manager class method //
		mr.dowork();
		
		System.out.println("---Main Thread Is ended---");
	}

}
