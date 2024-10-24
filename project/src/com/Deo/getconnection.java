package com.Deo;

import java.sql.Connection;
import java.sql.DriverManager;

public class getconnection {
	
	public static Connection getconnect() {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skmart", "root", "sai@123");
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
