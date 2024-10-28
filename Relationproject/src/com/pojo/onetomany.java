package com.pojo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connection.connection;

public class onetomany {
	
	public void getmobiledetail(String pname) {
		
		try {
			Connection con = connection.getconnect();
			PreparedStatement ps = con.prepareStatement("select m.msim, m.mnum from dell.mobile m where m.fkmpid = (select pid from dell.person p where p.pname = ?);");
			ps.setString(1, pname);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String msim = rs.getString("msim");
				int mnum = rs.getInt("mnum");
				
				System.out.println("mobiledetail"+"-----"+msim+"-----"+mnum);
				
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void getpersondetail(String msim) {
		
		try {
			Connection con = connection.getconnect();
			PreparedStatement ps = con.prepareStatement("select pname, page from dell.person p where p.pid in (select fkmpid from dell.mobile m where m.msim =?)");
			ps.setString(1, msim);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String pname = rs.getString("pname");
				int page = rs.getInt("page");
				
				System.out.println("persondetail"+"---"+pname+"---"+page);
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) {
		
		onetomany t = new onetomany();
		t.getmobiledetail("akshita");
		System.out.println("-----------------------------------");
		t.getpersondetail("bsnl");
	}

}
