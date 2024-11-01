package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {

	public static Connection getconnect() {
		  Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/slokam1", "root", "sai@123");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
