package com.ByUsingjdbcOperationsClass1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
	
	
	@Autowired
	private Dao di;
	

	public void save(StudentPojo std)
	{
		System.out.println("---This is Service Class---"+std);
		
		di.save(std);		
	}
	
	
	public void update(int sage, String sloc, int sid)
	{
		System.out.println("---Updateing the Service Class---"+sid);
		di.update(sage, sloc, sid);	
	}
	
	
	public void delete(int sid)
	{
		System.out.println("---Deleting the Controller---"+sid);	
		di.delete(sid);
	}
	
	
	public void getbyId(int sid)
	{
		System.out.println("----Service data is getbyId---"+sid);
		di.getbyId(sid);
	}
	
	
	
	public void getAll() 
	{
		
		System.out.println("----Controller data by Using GetAll----");
		di.getAll();
		
	}


}
