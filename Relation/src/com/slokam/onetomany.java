package com.slokam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.connection.connection;

public class onetomany {
	
	
	public void getmobiledata(String pname) {
		
		try {
			Connection con = connection.getconnect();
			PreparedStatement ps = con.prepareStatement("select k.msim, k.mnum from dell.person p inner join dell.mobile k where p.pname = ? and p.pid = k.fkmpid;");
			ps.setString(1, pname);
			ResultSet b = ps.executeQuery();
			while(b.next()) {
				String msim = b.getString("msim");
				int mnum = b.getInt("mnum");
				
				System.out.println("mobiledata"+"------"+msim+"-----"+mnum);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void getpersondata(String msim) {
		
		try {
			Connection con = connection.getconnect();
			PreparedStatement ps = con.prepareStatement("select p.pname, p.page from dell.person p inner join dell.mobile k where k.msim = ? and p.pid = k.fkmpid;");
			ps.setString(1, msim);
			ResultSet p = ps.executeQuery();
			while(p.next()) {
				String pname = p.getString("pname");
				int page = p.getInt("page");
				
				System.out.println("persondata"+"------"+pname+"-----"+page);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		
		onetomany m = new onetomany();
		//m.getmobiledata("akshita");
		m.getpersondata("bsnl");
		

	}

}
