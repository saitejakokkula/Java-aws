package com.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/slokam", "root", "sai@123");
			System.out.println(con);
		}catch(ClassNotFoundException e) {
			
			System.out.println("loaded class issuss--"+e);
			
		}catch(SQLException e) {
			System.out.println("connection is failed--"+e);
			
		}

	}

}
