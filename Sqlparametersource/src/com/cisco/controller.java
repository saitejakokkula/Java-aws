package com.cisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class controller {
	
	@Autowired
	private seriver s1;
	
	public employeepojo save(employeepojo emp) {
		
		System.out.println("I am in controller class---"+emp);
		 return s1.save(emp);
	}
	public void update(int sage, String scourse, int sid) {
		
		System.out.println("I am in controller class update ---");
		s1.update(sage,scourse,sid);
	}
	public void delete(int sid) {
		
		System.out.println("I am in controller class delete--");
		s1.delete(sid);
	}
	public employeepojo getByid(int sid) {
		
		System.out.println("I am in controller class getByid");
		return s1.getByid(sid);
	}
	public void getByname(int sid) {
		
		System.out.println(" I am in controller class getByname");
		 s1.getByname(sid);
	}

}
