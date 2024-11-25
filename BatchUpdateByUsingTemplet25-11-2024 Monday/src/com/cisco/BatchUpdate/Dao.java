package com.cisco.BatchUpdate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Dao
{
	@Autowired
	private JdbcTemplate jtemp;
	
	public void saveBatchinfo()
	{
		
		
		
		System.out.println("----this is deo Class-----");
		
		
		
		Object[] a = {17,"RajaGopal",25,98765,"pdl"};
		Object[] b = {18,"Gopal",27,56789,"sap"};
		Object[] c = {19,"Devagiri",29,98765,"nrt"};
		Object[] d = {20,"Lokesh",30,98756,"sap"};
		
		
		List<Object[]>  data = new ArrayList<>();
		
			data.add(a);
			data.add(b);
			data.add(c);
			data.add(d);
			
			
				
			jtemp.batchUpdate("insert into  springjdbc1.personpojo values(?,?,?,?,?);",data);
		
		
			System.out.println("----Data is inserted Succefullyy ----");

	}

}
