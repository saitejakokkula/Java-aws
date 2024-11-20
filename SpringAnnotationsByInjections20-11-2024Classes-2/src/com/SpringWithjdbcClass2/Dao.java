package com.SpringWithjdbcClass2;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dao {
	
	@Autowired
	private DataSource datasource;
	
	
	public void dowork()
	{
		System.out.println("---This is DaoClass Classs---");
		
		try
		{
			Connection con = datasource.getConnection();
			
			System.out.println(con);
			
			PreparedStatement ps = con.prepareStatement("insert into springjdbc.student values(2,'RajaGopal',26,'hyd');");
			
		int row =	ps.executeUpdate();
		
		System.out.println("--rows --"+row);
			
		}
		catch(Exception e) 
		{
			
		}
		
		
	}

}
