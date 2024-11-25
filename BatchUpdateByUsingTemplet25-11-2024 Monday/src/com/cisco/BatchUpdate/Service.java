package com.cisco.BatchUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service
{
	@Autowired
	private Dao di;
	
	public void saveBatchinfo()
	{
			System.out.println("---This is COntroller Class---");
			di.saveBatchinfo();
	}

}
