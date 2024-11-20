package com.SpringWithjdbcClass2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

	@Autowired
	private Dao de;
	
	
	public void dowork()
	{
		System.out.println("---This is Seviece Server related  Classs---");
		de.dowork();
	
	}
}
