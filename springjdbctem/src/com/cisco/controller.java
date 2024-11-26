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
    public void getname(int sid) {
    	
    	System.out.println("controll work on the client side--");
    	s1.getname(sid);
    }
    public void getage(int sid) {
    
    	
    	System.out.println("controll work on the client side---");
    	s1.getage(sid);
    }
    public void getcount() {
    	
    	System.out.println("controll work on the client side--");
    	s1.getcount();
    }
    public void getEmpdata(int sid) {
    	
    	System.out.println("controll work on the client side----");
    	s1.getEmpdat(sid);
    }
    public void getallEmpdata() {
    	
    	System.out.println("controll work on the client side----");
    	s1.getallEmpdata();
    }
    
    public void getallEmpdata1() {
    	
    	System.out.println("controll work on the client side--");
    	s1.getallEmpdata1();
    }
    public void batchupdate() {
    	
    	System.out.println("controll work on the client side--");
    	s1.batchupdate();
    }
   

}
