package com.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connection.connection;


public class operationjoin {
	
	public void getinnerdata() {
		Connection con = connection.getconnect();
		try {
			PreparedStatement ps = con.prepareStatement("select s.sname, s.sage, a.address from student1.student s inner join student1.address a  on s.sid = a.fkaid");
		    ResultSet row =ps.executeQuery();
		    while(row.next()) {
		    	
		    	String sname = row.getString("sname");
		    	int sage = row.getInt("sage");
		    	String address = row.getString("address");
		    	
		    	System.out.println("sname"+"----"+sname+"----"+"sage"+"----"+sage+"----"+"address"+"----"+address);
		    }
		    
		
			}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void getleftjoin() {
		Connection con = connection.getconnect();
		try {
			PreparedStatement ps = con.prepareStatement("select s.sname, s.sage, a.address from student1.student s left join student1.address a  on s.sid = a.fkaid;"
					+ "");
			ResultSet s = ps.executeQuery();
			 while(s.next()) {
			    	
			    	String sname = s.getString("sname");
			    	int sage = s.getInt("sage");
			    	String address = s.getString("address");
			    	
			    	System.out.println("sname"+"----"+sname+"----"+"sage"+"----"+sage+"----"+"address"+"----"+address);
			    }
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void getrigthjoin() {
		Connection con = connection.getconnect();
		try {
			PreparedStatement ps = con.prepareStatement("select s.sname, s.sage, a.address from student1.student s right join student1.address a on s.sid = a.fkaid");
			ResultSet s = ps.executeQuery();
			 while(s.next()) {
			    	
			    	String sname = s.getString("sname");
			    	int sage = s.getInt("sage");
			    	String address = s.getString("address");
			    	
			    	System.out.println("sname"+"----"+sname+"----"+"sage"+"----"+sage+"----"+"address"+"----"+address);
			    }
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		operationjoin o = new operationjoin();
		//o.getinnerdata();
		//o.getleftjoin();
		o.getrigthjoin();
	}

}
