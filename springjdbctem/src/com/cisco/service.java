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
	public void getname(int sid) {
		
		System.out.println("serive work on the server side---");
		da.getname(sid);
		
	}
	public void getage(int sid) {
		
		System.out.println("serive work on the server side---");
		da.getage(sid);
		
	}
	public void getcount() {
		
		System.out.println("serive work on the server side---");
		da.getcount();
		
	}
	public void getEmpdat(int sid) {
		
		System.out.println("serive work on the server side---");
		da.getEmpdata(sid);
		
	}
	public void getallEmpdata() {
		
		System.out.println("serive work on the server side----");
		da.getallEmpdata();
	}
	public void getallEmpdata1() {
		
		System.out.println("serive work on the server side----");
		da.getallEmpdata1();
	}
	public void batchupdate() {
		
		System.out.println("serive work on the server side---");
		da.batchupdate();
		
	}

}
