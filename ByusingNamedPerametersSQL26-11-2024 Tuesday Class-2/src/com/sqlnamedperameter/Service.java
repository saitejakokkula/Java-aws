package com.sqlnamedperameter;

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
		System.out.println("This is Service ");
		
		return di.save(poj);
	}
	
	
	public void update(int pid,int pagee,String ploc)
	{
		System.out.println("This is Service ");
		
		di.update(pid,pagee,ploc);
	}
	
	
	
	
	public void delete(int pid)
	{
		System.out.println("This is Service ");
		
		di.delete(pid);
	}
	
	public PersonPojo oneCompleteRow(int pid)
	{
		System.out.println("This is Service ");
		
		return di.oneCompleteRow(pid);
	}
	
	public String pname(int pid)
	{
		System.out.println("This is Service ");
		return di.pname(pid);
	}
	
	public List<PersonPojo> GetAll()
	{
		System.out.println("This is Service ");
		return di.GetAll();
	}
	
	public List<PersonPojo> GetAllRowMapInterface()
	{
		System.out.println("This is Service ");
		return di.GetAllRowMapInterface();
	}
	
	public List<Map<String, Object>> multirows()
	{
		System.out.println("This is Service ");
		return di.multirows();
	}
	
	
	public List<Map<String, Object>> MultiColumns()
	{
		System.out.println("This is Service ");
		return di.MultiColumns();
	}
	
	public List<Map<String, Object>> MulticolOneRow(int pid)
	{
		System.out.println("This is Service ");
		return di.MulticolOneRow(pid);
	}
	


}
