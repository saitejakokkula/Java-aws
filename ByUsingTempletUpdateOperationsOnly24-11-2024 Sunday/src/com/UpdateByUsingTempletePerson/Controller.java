package com.UpdateByUsingTempletePerson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller
{
	
	@Autowired
	private service si;
	
	
	public void Save(PersonPojo poj)
	{
		System.out.println("---this Is Controller Save Option---");
		si.Save(poj);
		
	}
	
	
	public void update(int pagee,long pmob,int pid)
	{
		System.out.println("---this Is Controller update Option---");
		si.update(pagee,pmob, pid);
	}
	
	public void delete(int pid)
	{
		System.out.println("This is Controller Classs --Delete Option--");
		si.delete(pid);
		
	}

}
