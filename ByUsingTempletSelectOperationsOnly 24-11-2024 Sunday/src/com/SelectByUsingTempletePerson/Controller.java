package com.SelectByUsingTempletePerson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller
{
	
	@Autowired
	private Service si;
	
	
	
	
	//One row Operation with Single Column
	public void OnerowOneColuman(int pid)
	{
			
		System.out.println("This is Controller Class");
		si.OnerowOneColuman(pid);
	}
	
	
	//One complete row Operation with multiple  Column
	public void OneEmployedata(int pid)
	{
		System.out.println("This is Controller Class");
		si.OneEmployedata(pid);
	}
	
	//Maximum age of employe
	public void Maxesal()
	{
		System.out.println("This is Controller Class");
		si.Maxesal();
	}
	
	

	//minimum age of employe
	public void Minesal()
	{
		System.out.println("This is Controller Class");
		si.Minesal();
	}
	
	//Count of Persons //
	public void countperson()
	{
		System.out.println("This is Controller Class");
		si.countperson();
	}
	
	//Sum of Age //
	public void sumage()
	{
		System.out.println("This is Controller Class");
		si.sumage();
	}
//--------------------------------------------------------------------------//
	
	//Multiple rows with multiple columns //
	public void allempdata()
	{
		System.out.println("This is Controller Class");
		si.allempdata();
		
	}
	
	//multiple row maps with multiple columns are not matched //
	
	public void getallnocolumnmatch()
	{
		System.out.println("This is Controller Class");
		si.getallnocolumnmatch();
	}
	
	//------------------------------------------------------------------------//
	
	//Multiple rows with single column //
	public void multirscolu()
	{
		System.out.println("This is Controller Class");
		si.multirscolu();
	}
	
	//Multiple rows with all columns  //
	//By Taking pname,page,phone number //
	
	public void pnameagenumber()
	{
		System.out.println("This is Controller Class");
		si.pnameagenumber();
	}
	
	
	
	
	
	//By using name,age Where pid .//
	
	public void pnamepagenumber(int pid)
	{
		System.out.println("This is Controller Class");
		si.pnamepagenumber(pid);
	}
	

	
	
	
	
	
}
