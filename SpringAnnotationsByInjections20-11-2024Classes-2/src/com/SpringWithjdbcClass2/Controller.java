package com.SpringWithjdbcClass2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
	
	
	@Autowired
	private Service se;
	
	
	
	public void dowork()
	{
		System.out.println("---This is Controller Classs---");
		se.dowork();
	}
	
	

}
