package com.cisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class seriver {
	
	@Autowired
	private deo d1;

	public employeepojo save(employeepojo emp) {
		
		System.out.println(" I am in seriver class---"+emp);
	   return d1.save(emp);
	}

	public void update(int sage, String scourse, int sid) {
		
		System.out.println("I am in seriver class update---");
		d1.update(sage,scourse,sid);
	}

	public void delete(int sid) {
		
		System.out.println("I am in seriver class delete---");
		d1.delete(sid);
	}

	public employeepojo getByid(int sid) {
		
		System.out.println(" I am in seriver class getByid---");
		return d1.getByid(sid);
		
	}

	public void getByname(int sid) {
		
		System.out.println("I am in seriver class getByid---");
		 d1.getByname(sid);
		
	}

	

}
