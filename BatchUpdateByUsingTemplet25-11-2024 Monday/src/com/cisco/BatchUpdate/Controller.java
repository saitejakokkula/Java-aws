package com.cisco.BatchUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller
{
	@Autowired
	private Service si;
	
	public void saveBatchinfo()
	{
			System.out.println("---This is COntroller Class---");
			si.saveBatchinfo();
	}

}
