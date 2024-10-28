package com.pojo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connection.connection;

public class onetoone {
	
public void getpassportdetails(String pname) {
		
		try {
			Connection con = connection.getconnect();
			PreparedStatement ps = con.prepareStatement("select passpnum,passexpdata from dell.passport t where t.fkpid = (select pid from dell.person p where p.pname = ?)");
			
			ps.setString(1, pname);
		    ResultSet s = ps.executeQuery();
		    while(s.next()) {
		    	
		    	String passpnum = s.getString("passpnum");
		    	int passexpdata = s.getInt("passexpdata");
		    	
		    	System.out.println("passportdetail"+"-----"+passpnum+"------"+passexpdata);
		    }
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
public void getpersondetial(String passpnum) {
	
	try {
		Connection con = connection.getconnect();
		PreparedStatement ps = con.prepareStatement("select p.pname,p.page from dell.person p where p.pid = (select t.fkpid from dell.passport t  where t.passpnum = ?)");
		ps.setString(1, passpnum);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			String pname = rs.getString("pname");
			int page = rs.getInt("page");
			
			System.out.println("persondetial"+"------"+pname+"----"+page);
		}
				
		
	}catch(Exception e) {
		System.out.println(e);
	}
	
}
	public static void main(String[] args) {
		
		onetoone o = new onetoone();
		o.getpassportdetails("akshita");
		o.getpersondetial("852asd");
	}
	 
}
