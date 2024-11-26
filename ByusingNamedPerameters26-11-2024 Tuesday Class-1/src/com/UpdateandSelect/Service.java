package com.UpdateandSelect;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service
{
	@Autowired
	private Dao di;
	
	public PersonPojo save(PersonPojo poj)
	{
		System.out.println("This is Service Class");
		return di. save(poj);
	}
	
	
	public void update(int pid,int pagee,String ploc)
	{
		System.out.println("This Service Class");
		
		di.update(pid, pagee, ploc);
		
	}
	
	
	public void delete(int pid)
	{
		System.out.println("This Service Class");
		di.delete(pid);
	}
	
	public PersonPojo onedata(int pid)
	{
		System.out.println("This Service Class");
		
		return di.onedata(pid);
	}
	
	public String pname(int pid)
	{
		System.out.println("This Service Class");
		
		return di.pname(pid);
	}
	
	
	public List<PersonPojo> alldata()
	{
		System.out.println("This Service Class");
		
		return di.alldata();
	}
	
	
	public List<PersonPojo> alldata1()
	{
		return di.alldata1();
	}
	
	public List<Map<String, Object>> allpname()
	{
		return di.allpname();
	}
	
	public List<Map<String, Object>> MultiPnamePage()
	{
		return di.MultiPnamePage();
	}
	
	public List<Map<String, Object>> MulticoluOneRow(int pid)
	{
		return di.MulticoluOneRow( pid);
	}
	
	
	
	
		




}
