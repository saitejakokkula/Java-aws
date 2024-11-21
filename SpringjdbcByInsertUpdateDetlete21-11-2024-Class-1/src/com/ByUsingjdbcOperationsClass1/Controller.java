package com.ByUsingjdbcOperationsClass1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller
{
	
	@Autowired
	private Service si;
	
		public void save(StudentPojo std)
		{
		
			System.out.println("----This is Controller Class----"+std);
		
			si.save(std);	
		}
	
	
		public void update(int sage, String sloc, int sid)
		{
			System.out.println("---Updateing the Controller Class---"+sid);
			si.update(sage, sloc, sid);
		}
		
		
		public void delete(int sid)
		{
			System.out.println("---Deleting the Controller---"+sid);
			si.delete(sid);
			
		}
		
		public void getbyId(int sid)
		{
			System.out.println("----Controller data is getbyId---"+sid);
			si.getbyId(sid);
		}
		
		
		
		public void getAll() 
		{
			
			System.out.println("----Controller data by Using GetAll----");
			si.getAll();
			
		}
		
		
		
		
		
		

}
