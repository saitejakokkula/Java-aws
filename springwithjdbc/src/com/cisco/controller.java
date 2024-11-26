package com.cisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class controller {
	
	@Autowired
	private service s1;
	
	public void save(employeepojo emp) {
		
		System.out.println("controll work on the client side---");
		s1.save(emp);
	}
	
    public void update(int sage, String scourse, int sid) {
		
		System.out.println("controll work on the client side---");
		s1.update(sage, scourse, sid);
	}
    
    public void delete(int sid) {
    	
    	System.out.println("controll work on the client side---");
    	s1.delete(sid);
    }
    public void getById(int sid) {
    	
    	System.out.println("controll work on the client side--");
    	s1.getById(sid);
    }
    public void getall() {
    	
    	System.out.println("controll work on the client side---");
    	s1.getall();
    }

}
