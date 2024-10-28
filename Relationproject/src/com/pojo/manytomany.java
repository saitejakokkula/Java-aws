package com.pojo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connection.connection;

public class manytomany {
	
	
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
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		
		manytomany m = new manytomany();
		m.getcoursedata("akshita");
		System.out.println("--------------------------------");
		m.getpersondetail("java");
	}

}
