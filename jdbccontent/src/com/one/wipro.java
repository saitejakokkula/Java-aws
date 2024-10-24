package com.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class wipro {
	
	public void deletedata(int sid) {
		
		try {
			System.out.println("Started-----------------------");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/slokam", "root", "sai@123");
			PreparedStatement sp = con.prepareStatement("delete from slokam.student where sid = ?");
			sp.setInt(1, sid);
			sp.executeUpdate();
			System.out.println("The row is delete------------------");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public void updatedata(int sid, double smarks, String sloc) {
		
		try {
			System.out.println("Started------------------");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/slokam", "root", "sai@123");
			PreparedStatement ps = con.prepareStatement("update slokam.student set smarks = ?, sloc = ? where sid = ?");
			ps.setDouble(1, smarks);
			ps.setString(2, sloc);
			ps.setInt(3, sid);
			ps.executeUpdate();
			System.out.println("update----------"+ps);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public void inserdata(int sid, String sname, int sage, double smarks, String sloc) {
				try {
					System.out.println("Started----------");
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/slokam", "root", "sai@123");
					PreparedStatement ps = con.prepareStatement("insert slokam.student(sid, sname, sage, smarks, sloc) values(?, ?, ?, ?, ?)");
					ps.setInt(1, sid);
					ps.setString(2, sname);
					ps.setInt(3, sage);
					ps.setDouble(4, smarks);
					ps.setString(5, sloc);
					ps.executeUpdate();
					System.out.println("Ended---------------");
				}catch(ClassNotFoundException e) {
					System.out.println(e);
				}catch(SQLException e) {
					System.out.println(e);
					
				}

			}
	
	public static void main(String[] args) {
		
		wipro w = new wipro();
		//w.inserdata(3, "sam", 25, 563, "hyd");
		//w.updatedata(2, 85.36, "HYD");
		//w.deletedata(1);
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Choose an operation: 1 - Insert, 2 - Update, 3 - Delete");
	     int choice = sc.nextInt();
	     
	     if (choice == 1) {
	            System.out.println("Enter student sid:");
	            int sid = sc.nextInt();
	            System.out.println("Enter student sname:");
	            String sname = sc.next();
	            System.out.println("Enter student sage:");
	            int sage = sc.nextInt();
	            System.out.println("Enter student smarks:");
	            double smarks = sc.nextDouble();
	            System.out.println("Enter student sloc:");
	            String sloc = sc.next();
	            
	            w.inserdata(sid, sname, sage, smarks, sloc);
	     }else if(choice == 2) {
	    	 System.out.println("Enter student sid:");
	    	 int sid = sc.nextInt();
	    	 System.out.println("Enter student smarks:");
	    	 double smarks = sc.nextDouble();
	    	 System.out.println("Enter student sloc:");
	    	 String sloc = sc.next();
	    	   w.updatedata(sid, smarks, sloc);
	        } else if (choice == 3) {
	            System.out.println("Enter student sid to delete:");
	            int sid = sc.nextInt();
	            
	            w.deletedata(sid);
	        } else {
	            System.out.println("Invalid choice");
	        }
	     }

	}


