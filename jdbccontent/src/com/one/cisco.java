package com.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class cisco {
	
	public void getbyname(String ename) {
		
		try {
			System.out.println("Started------------------");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcs", "root", "sai@123");
			PreparedStatement ps = con.prepareStatement("select * from tcs.employee where ename = ?");
			ps.setString(1, ename);
			ResultSet a = ps.executeQuery();
			
			while(a.next()) {
				System.out.println(a.getInt("eid"));
				System.out.println(a.getString("ename"));
				System.out.println(a.getDouble("esal"));
				System.out.println(a.getString("edeg"));
			}
			System.out.println("complete------------------------");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e){
			System.out.println(e);
		}
			
		}
	
	public void getalldata() {
		
		try{
			System.out.println("Started---------------");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcs", "root", "sai@123");
		    PreparedStatement ps =	con.prepareStatement("select * from tcs.employee");
		   ResultSet a = ps.executeQuery();
		    while(a.next()) {
		    	System.out.println(a.getInt("eid"));
		    	System.out.println(a.getString("ename"));
		    	System.out.println(a.getDouble("esal"));
		    	System.out.println(a.getString("edeg"));
		    	System.out.println("-----------------------------------------");
		    }
		    System.out.println("Ended--------------------");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
			
		}
	}
	
	public void getbyid(int eid) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcs", "root", "sai@123");
	        PreparedStatement ps = con .prepareStatement("select * from tcs.employee where eid = ?");
	        ps.setInt(1, eid);
	        ResultSet a = ps.executeQuery();
	        
	        while(a.next()) {
	        	
	        	System.out.println(a.getInt("eid"));
	        	System.out.println(a.getString("ename"));
	        	System.out.println(a.getDouble("esal"));
	        	System.out.println(a.getString("edeg"));
	        	
	        }
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
			
		}
	}

	public static void main(String[] args) {
		
		cisco c = new cisco();
		//c.getbyid(2);
		//c.getalldata();
		//c.getbyname("madhavi");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("select the Operation: 1- getbyid, 2- getalldata, 3- getbyname");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter employee eid:");
			int eid = sc.nextInt();
			c.getbyid(eid);
		}else if(choice == 2) {
			c.getalldata();
		}else if(choice == 3) {
			System.out.println("Enter employee ename:");
			String ename = sc.next();
			c.getbyname(ename);
		}else {
			System.out.println("Invalid statement");
		}

	}

}
