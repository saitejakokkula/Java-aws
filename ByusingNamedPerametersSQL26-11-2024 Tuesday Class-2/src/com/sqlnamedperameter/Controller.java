package com.sqlnamedperameter;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller
{
	@Autowired
	private Service si;
	
	public PersonPojo save(PersonPojo poj)
	{
		System.out.println("This is Controller ");
		
		return si.save(poj);
	}
	
	
	public void update(int pid,int pagee,String ploc)
	{
		System.out.println("This is controller ");
		
		si.update(pid,pagee,ploc);
	}
	
	
	public void delete(int pid)
	{
		System.out.println("This is controller ");
		si.delete(pid);
	}
	
	
	public PersonPojo oneCompleteRow(int pid)
	{
		System.out.println("This is controller ");
		 return si.oneCompleteRow(pid);
	}
	
	
	public String pname(int pid)
	{
		System.out.println("This is controller ");
		return si.pname(pid);
	}
	
	public List<PersonPojo> GetAll()
	{
		System.out.println("This is controller ");
		return si.GetAll();
	}
	
	public List<PersonPojo> GetAllRowMapInterface()
	{
		System.out.println("This is Controller ");
		return si.GetAllRowMapInterface();
	}
	
	public List<Map<String, Object>> multirows()
	{
		System.out.println("This is Controller ");
		return si.multirows();
	}
	
	public List<Map<String, Object>> MultiColumns()
	{
		System.out.println("This is Controller  ");
		return si.MultiColumns();
	}
	
	public List<Map<String, Object>> MulticolOneRow(int pid)
	{
		
		System.out.println("This is Controller  ");
		return si.MulticolOneRow(pid);
	}

}
