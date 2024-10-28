package com.slokam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.connection.connection;

public class manytomany {
	
public void getcoursedata(String pname) {
		
		try {
			Connection con = connection.getconnect();
			PreparedStatement ps = con.prepareStatement("select c.cname, c.cfee from dell.person p inner join dell.course c inner join dell.percoudata pc where p.pname = ? and p.pid = pc.fkppid and pc.fkccid = c.cid; ");
			ps.setString(1, pname);
			ResultSet b = ps.executeQuery();
			while(b.next()) {
				String cname = b.getString("cname");
				double cfee = b.getDouble("cfee");
				
				System.out.println("coursedata"+"------"+cname+"-----"+cfee);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void getpersondata(String cname) {
		
		try {
			Connection con = connection.getconnect();
			PreparedStatement ps = con.prepareStatement("select p.pname, p.page from dell.person p inner join dell.course c inner join dell.percoudata pc where c.cname = ? and p.pid = pc.fkppid and pc.fkccid = c.cid; ");
			ps.setString(1, cname);
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
		
		manytomany x = new manytomany();
		//x.getcoursedata("akshita");
		x.getpersondata("aws");
		

	}

}
