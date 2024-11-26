package com.cisco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class deo {
	
	@Autowired
	private DataSource dataSource;
	
	public void save(employeepojo emp) {
		
		System.out.println("deo work on jdbc opration---");
		try {
		Connection con = dataSource.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into slokam1.student values(?,?,?,?);");
		ps.setInt(1, emp.getSid());
		ps.setString(2, emp.getSname());
		ps.setInt(3, emp.getSage());
		ps.setString(4, emp.getScourse());
		int row = ps.executeUpdate();
		System.out.println("insert row---"+row);
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

	public void update(int sage, String scourse, int sid) {
		
		System.out.println("deo work on jdbc opration---");
		try {
		Connection con = dataSource.getConnection();
		PreparedStatement ps = con.prepareStatement("update slokam1.student set sage = ?, scourse = ? where sid = ?;");
		ps.setInt(1, sage);
		ps.setString(2, scourse);
		ps.setInt(3, sid);
		int row = ps.executeUpdate();
		System.out.println("insert row---"+row);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void delete(int sid) {
		System.out.println("deo work on jdbc opration---");
		try {
		Connection con = dataSource.getConnection();
		PreparedStatement ps = con.prepareStatement("delete from slokam1.student where sid = ?;");
		ps.setInt(1, sid);
		int row = ps.executeUpdate();
		System.out.println("insert row---"+row);
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

	public void getById(int sid) {
		System.out.println("deo work on jdbc opration---");
		try {
		Connection con = dataSource.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from slokam1.student where sid = ?");
		ps.setInt(1, sid);
	    ResultSet r =	ps.executeQuery();
		while(r.next()) {
			
			System.out.println(r.getInt("sid")+"---"+r.getString("sname")+"------"+r.getInt("sage")+"-----"+r.getString("scourse"));
		}
	    
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

	public void getall() {
		
		System.out.println("deo work on jdbc opration---");
		try {
		Connection con = dataSource.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from slokam1.student");
	    ResultSet r =	ps.executeQuery();
		while(r.next()) {
			
			System.out.println(r.getInt("sid")+"---"+r.getString("sname")+"------"+r.getInt("sage")+"-----"+r.getString("scourse"));
		}
	    
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		
	}
	
}
