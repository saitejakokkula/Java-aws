package com.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class production {
	
	public void getbyname(String pname) {
		
		try {
			System.out.println("-----------Started------------");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dmart", "root", "sai@123");
			PreparedStatement ps = con.prepareCall("select * from dmart.production where pname = ?");
			ps.setString(1, pname);
			ResultSet a = ps.executeQuery();
			
			while(a.next()) {
				System.out.println(a.getInt("pid"));
				System.out.println(a.getString("pname"));
				System.out.println(a.getDouble("price"));
				System.out.println(a.getDouble("pgst"));
				System.out.println(a.getString("pbrand"));
			}
			System.out.println("---------Complete---------");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	
	public void getalldata() {
		
		try {
			System.out.println("------Started----------");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dmart", "root", "sai@123");
			PreparedStatement ps = con.prepareCall("select * from dmart.production order by pname");
	        ResultSet s = ps.executeQuery();
	        
	        while(s.next()) {
	        	
	        	System.out.println(s.getInt("pid"));
	        	System.out.println(s.getString("pname"));
	        	System.out.println(s.getDouble("price"));
	        	System.out.println(s.getDouble("pgst"));
	        	System.out.println(s.getString("pbrand"));
	        	System.out.println("--------------------------------------");
	        	
	        }
	        System.out.println("-----------Completed------------");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	
	public void getbyid(int pid) {
		
		try {
			System.out.println("-----------Started--------");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dmart", "root", "sai@123");
			PreparedStatement ps = con.prepareStatement("select * from dmart.production where pid = ?");
			ps.setInt(1, pid);
			ResultSet s = ps.executeQuery();
			
			while(s.next()) {
				
				System.out.println(s.getInt("pid"));
				System.out.println(s.getString("pname"));
				System.out.println(s.getDouble("price"));
				System.out.println(s.getDouble("pgst"));
				System.out.println(s.getString("pbrand"));
			}
			System.out.println("----------Completed------------");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	
	public void deletedata(int pid) {
		
		try {
			System.out.println("--------Started---------");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dmart", "root", "sai@123");
	        PreparedStatement ps = con.prepareStatement("delete from dmart.production where pid = ?");
	        ps.setInt(1, pid);
	        ps.executeUpdate();
	        System.out.println("---------Completed-----------");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public void updatedata(int pid, double pgst, String pbrand) {
		
		try{	
		System.out.println("---------Started----------");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dmart", "root", "sai@123");
		PreparedStatement ps =  con.prepareStatement("update dmart.production set pgst = ?, pbrand = ? where pid = ?");
		ps.setDouble(1, pgst);
		ps.setString(2, pbrand);
		ps.setInt(3, pid);
		ps.executeUpdate();
		System.out.println("----------Ended-----------");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}
		
	}
	
	
	public void insertdata(int pid, String pname, double price, double pgst, String pbrand) {
		
		try{
			System.out.println("Startes-----------------------");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dmart", "root", "sai@123");
	        PreparedStatement ps = con.prepareStatement("insert into dmart.production(pid, pname, price, pgst, pbrand) values(?, ?, ?, ?, ?)");
	        ps.setInt(1, pid);
	        ps.setString(2, pname);
	        ps.setDouble(3, price);
	        ps.setDouble(4, pgst);
	        ps.setString(5, pbrand);
	        ps.executeUpdate();
	        System.out.println("Complete---------------");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
		production p = new production();
		//p.insertdata(1,"Icecream", 50.36, 60.86, "Amul");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose a Opeartion: 1- insert, 2- update, 3- delete, 4- getbyid, 5- getalldata, 6- getbyname");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter product pid:");
			int pid = sc.nextInt();
			System.out.println("Enter product pname:");
			String pname = sc.next();
			System.out.println("Enter product price:");
			double price = sc.nextDouble();
			System.out.println("Enter product pgst:");
			double pgst = sc.nextDouble();
			System.out.println("Enter product pbrand:");
			String pbrand = sc.next();
			
			p.insertdata(pid, pname, price, pgst, pbrand);
		}else if(choice == 2) {
			System.out.println("Enter product pid:");
			int pid = sc.nextInt();
			System.out.println("Enter product pgst:");
			double pgst = sc.nextDouble();
			System.out.println("Enter product pbrand:");
			String pbrand = sc.next();
			
			p.updatedata(pid, pgst, pbrand);
		}else if(choice == 3) {
			System.out.println("Enter product pid:");
			int pid = sc.nextInt();
			
			p.deletedata(pid);
		}else if(choice == 4) {
			System.out.println("Enter product pid:");
			int pid = sc.nextInt();
			p.getbyid(pid);
		}else if(choice == 5) {
			p.getalldata();
		}else if(choice == 6) {
			System.out.println("Enter product pname:");
			String pname = sc.next();
			p.getbyname(pname);
		}else {
			System.out.println("Invalid Operation");
		}
	}

}
