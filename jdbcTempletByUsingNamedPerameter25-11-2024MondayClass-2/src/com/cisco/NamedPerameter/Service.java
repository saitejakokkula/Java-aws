package com.cisco.NamedPerameter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Service
{
	@Autowired
	private Dao di;
	
	
	public PersonPojo save(PersonPojo poj)
	{
		
		System.out.println("This is Service Classs");
		return di.save(poj);
	}
	
	public PersonPojo update(int pagee,long pmob,int pid)
	{
		System.out.println("This is Service Class");
		return di.update(pagee,pmob,pid);
	}
	
	public void delete(int pid)
	{
		System.out.println("This is Controller---");
		di.delete(pid);
	}

}
