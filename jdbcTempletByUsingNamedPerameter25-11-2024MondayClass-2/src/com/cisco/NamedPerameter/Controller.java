package com.cisco.NamedPerameter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller
{
	@Autowired
	private Service si;
	
	
	public PersonPojo save(PersonPojo poj)
	{
		
		System.out.println("This is Controller Class");
		return si.save(poj) ;
	}
	
	
	public PersonPojo update(int pagee,long pmob,int pid)
	{
		System.out.println("This is Controller Class");
		return si.update(pagee,pmob,pid);
	}
	
	public void delete(int pid)
	{
		System.out.println("This is Controller---");
		si.delete(pid);
		
	}
	
	
}
