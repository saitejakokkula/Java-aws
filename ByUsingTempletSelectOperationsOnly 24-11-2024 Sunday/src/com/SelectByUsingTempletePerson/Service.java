package com.SelectByUsingTempletePerson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service
{
	@Autowired
	private Dao di;
	
	//One row Operation with Single Column
		public void OnerowOneColuman(int pid)
		{
				System.out.println("This is Service Class");
				di.OnerowOneColuman(pid);
			
		}
		
		
		//One complete row Operation with multiple  Column
		public void OneEmployedata(int pid)
		{
			System.out.println("This is Service Class");
			di.OneEmployedata(pid);
		}
		
		
		//Maximum sal of employe
		public void Maxesal()
		{
			System.out.println("This is Service Class");
			di.Maxesal();
		}
		
		//minimum age of employe
		public void Minesal()
		{
			System.out.println("This is Service Class");
			di.Minesal();
		}
		
		
		//Count of Persons //
		public void countperson()
		{
			System.out.println("This is Service Class");
			di.countperson();
		}
		
		
		//Sum of Age //
		public void sumage()
		{
			System.out.println("This is Service Class");
			di.sumage();
		}

		//--------------------------------------------------------------//
		
		//Multiple rows with multiple columns //
		public void allempdata()
		{
			System.out.println("This is Controller Class");
			di.allempdata();
		}
		
		//multiple row maps with multiple columns are not matched //
		
		public void getallnocolumnmatch()
		{
			System.out.println("This is Controller Class");
			di.getallnocolumnmatch();
		}

		//--------------------------------------------------------------------//
		
		
		//Multiple rows with single column //
		public void multirscolu()
		{
			System.out.println("This is Service Class");
			di.multirscolu();
		}
		
		
		
		
		
		//Multiple rows with all columns  //
		//By Taking pname,page,phone number //
		
		public void pnameagenumber()
		{
			System.out.println("This is Service Class");
			di.pnameagenumber();
		}
		
		
		//By using name,age Where pid .//
		public void pnamepagenumber(int pid)
		{
			System.out.println("This is Service Class");
			di.pnamepagenumber(pid);
		}
		
		
		
		
		
		
		
		
		
		
		
}
