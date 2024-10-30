package com.slokam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.connection.connection;

public class test {

	
        public void insertdata() {
		
		try {
			Connection con = connection.getconnect();
			//it for create statement, it used for static insert values 
			//it can compiles many times, based upon object creation
			Statement t = con.createStatement();
			t.executeUpdate("insert into employee.employee values(6,'sam',45.36,'karimnagar');");
			t.executeUpdate("insert into employee.employee values(5,'suresh',55.36,'guturu');");
			System.out.println("insert data:"+t);
			
		}catch(Exception e) {
			System.out.println(e);
			}

	}
        public void insertdatabase() {
        	
        	try {
        		Connection con = connection.getconnect();
        		//prepareStatement is used to insert dynamic values  into database
        		//In prepareStatement Query compiles one time. 
        		PreparedStatement ps = con.prepareStatement("insert into employee.employee values(?,?,?,?)");
        		ps.setInt(1, 7);
        		ps.setString(2, "aditya");
        		ps.setDouble(3, 896.35);
        		ps.setString(4, "nizam");
        		ps.executeUpdate();
        		
        		ps.setInt(1, 8);
        		ps.setString(2, "adhi");
        		ps.setDouble(3, 825.35);
        		ps.setString(4, "chadhanagar");
        		ps.executeUpdate();
        		
        		ps.setInt(1, 9);
        		ps.setString(2, "suma");
        		ps.setDouble(3, 825.35);
        		ps.setString(4, "ramanagar");
        		ps.executeUpdate();
        		
        		
        	}catch(Exception e) {
        		System.out.println(e);
        	}
        }
        
        
        public void insertbatchdata() {
        	
        	try {
        		Connection con = connection.getconnect();
        		PreparedStatement ps = con.prepareStatement("insert into employee.employee values(?,?,?,?)");
        		con.setAutoCommit(true);
        		ps.setInt(1, 22);
        		ps.setString(2, "roja");
        		ps.setDouble(3, 856.35);
        		ps.setString(4, "nizam");
        		ps.addBatch();
        		
        		ps.setInt(1, 18);
        		ps.setString(2, "adit");
        		ps.setDouble(3, 875.35);
        		ps.setString(4, "chadhanagar");
        		ps.addBatch();
        		
        		ps.setInt(1, 23);
        		ps.setString(2, "sha");
        		ps.setDouble(3, 895.35);
        		ps.setString(4, "ramanagar");
        		ps.addBatch();
        		
        	    con.commit();
        	    System.out.println("insertdata:"+con);

        		
        		ps.executeUpdate();
        	}catch(Exception e) {
        		System.out.println(e);
        	}
        }
        
        
	
	public static void main(String[] args) {
		
		test s = new test();
		//s.insertdata();
		//s.insertdatabase();
		s.insertbatchdata();
	}
}
