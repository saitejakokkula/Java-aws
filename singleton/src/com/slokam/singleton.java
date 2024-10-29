package com.slokam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connection.connection;



public class singleton {
	
	// Private constructor to restrict instantiation from other classes
	private singleton() {
		
	}
	
	private static  singleton singleton = null;

	// Public method to provide access to the single instance, with lazy initialization
	public static singleton getSingle() {
		if(singleton == null) {
			
			synchronized (singleton.class) {
				
				singleton = new singleton();
			}
		}
		return singleton;
	}
	
	public void message() {
		System.out.println("hello singleton --!");
	}
	
	 public void connectToDatabase() {
		 Connection con = connection.getconnect();
	        if (con != null) {
	            System.out.println("Connection established successfully!");
	            // You can now use the connection object to perform database operations.
	        } else {
	            System.out.println("Failed to establish connection.");
	        }
	    }
	 
		public void getcoursedata(String pname) {
			
			try {
				Connection con = connection.getconnect();
				PreparedStatement ps = con.prepareStatement("select c.cname,c.cfee from dell.course c where c.cid in(select pc.fkppid from dell.percoudata pc where pc.fkccid = (select p.pid from dell.person p where p.pname = ?));");
				ps.setString(1, pname);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					String cname = rs.getString("cname");
					double cfee = rs.getDouble("cfee");
					
					
					
					System.out.println("coursedata"+"------"+cname+"-----"+cfee);
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
		
		public void getpersondetail(String cname) {
			
			try {
				Connection con = connection.getconnect();
				PreparedStatement ps = con.prepareStatement("select p.pname,p.page from dell.person p where p.pid in(select pc.fkccid from dell.percoudata pc where pc.fkppid =(select c.cid from dell.course c where c.cname = ?))");
				ps.setString(1, cname);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					String pname = rs.getString("pname");
					int page = rs.getInt("page");
					
					System.out.println("persondetail"+"------"+pname+"------"+page);
					System.out.println(con.hashCode());
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	
}
