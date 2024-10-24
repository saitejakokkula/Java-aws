package com.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Tcs {
	
	public void insertdate(int eid, String ename, double esal, String edeg) {
		
		
		try {
			System.out.println("Started-------------");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcs", "root", "sai@123");
			PreparedStatement ps  =  con.prepareStatement("insert tcs.employee(eid, ename, esal, edeg) values(?, ?, ?, ?)");
			ps.setInt(1, eid);
			ps.setString(2, ename);
			ps.setDouble(3, esal);
			ps.setString(4, edeg);
			ps.executeUpdate();
			System.out.println("Completed------------------");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
			
		}
	}
	
	public static void main(String[] args) {
		
		Tcs t = new Tcs();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select a Operation: 1-insert");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter employee eid:");
			int eid = sc.nextInt();
			System.out.println("Enter employee ename");
			String ename = sc.next();
			System.out.println("Enter employee esal");
			double esal = sc.nextDouble();
			System.out.println("Enter employe  edeg");
			String edeg = sc.next();
			
			t.insertdate(eid, ename, esal, edeg);
		}else {
			System.out.println("Invalid Statement");
		}
	}

}
