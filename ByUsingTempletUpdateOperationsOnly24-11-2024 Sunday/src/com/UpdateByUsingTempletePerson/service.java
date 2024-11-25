package com.UpdateByUsingTempletePerson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class service
{
	
	@Autowired
	private Dao di;
	
	public void Save(PersonPojo poj)
	{
		
		System.out.println("--This is Service Save --");
		di.Save(poj);
	}
	
	
	public void update(int pagee,long pmob,int pid)
	{
		System.out.println("---this Is Service update Option---");
		di.update(pagee, pmob, pid);
	}
	
	
	public void delete(int pid)
	{
		System.out.println("This is Service Classs --Delete Option--");
		di.delete(pid);
		
	}
	
	

}
