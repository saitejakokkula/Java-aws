package com.cisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class service {
	
	@Autowired
	private deo da;
	
	public void save(employeepojo emp) {
		
		System.out.println("service work on the server side----");
		da.save(emp);
	}
	 public void update(int sage, String scourse, int sid) {
			
		System.out.println("serive work on the server side---");
		da.update(sage, scourse, sid);
	}
	 public void delete(int sid) {
		 
		 System.out.println("serive work on the server side--- ");
		 da.delete(sid);
	 }
	public void getById(int sid) {
		
		System.out.println("serive work on the server side---");
		da.getById(sid);
		
	}
	public void getall() {
		
		System.out.println("serive work on the server side---");
		da.getall();
		
	}

}
