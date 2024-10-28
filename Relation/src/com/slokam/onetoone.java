package com.slokam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;

import com.connection.connection;

public class onetoone {
	
	
	public void getpassportdetails(String pname) {
		
		try {
			Connection con = connection.getconnect();
			PreparedStatement ps = con.prepareStatement("select m.passpnum, m.passexpdata from dell.person p inner join dell.passport m where p.pname = ? and p.pid = m.fkpid");
			
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
	
	public void getpersondetails(String passnum) {
		
		try {
			Connection con = connection.getconnect();
			PreparedStatement ps = con.prepareStatement("select p.pname, p.page from dell.person p inner join dell.passport m where m.passpnum = ? and p.pid = m.fkpid;");
			ps.setString(1, passnum);
			ResultSet a = ps.executeQuery();
			while(a.next()) {
				String pname = a.getString("pname");
				int page = a.getInt("page");
				
				System.out.println("person"+"-------"+pname+"------"+page);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {


		onetoone o = new onetoone();
		//o.getpassportdetails("akshita");
		o.getpersondetails("852asd");

	}

}
