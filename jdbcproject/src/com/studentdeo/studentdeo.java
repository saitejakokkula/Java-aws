package com.studentdeo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.studentpojo.student;

public class studentdeo {
	
	
public void save(student std) {
	
		System.out.println("Iam in sudentdeo---"+std);
		Connection con = getconnection.getconnect();
	    try {
			PreparedStatement ps =con.prepareStatement("insert into slokam.student values(?,?,?,?,?)");
			ps.setInt(1, std.getSid());
			ps.setString(2, std.getSname());
			ps.setInt(3, std.getSage());
			ps.setDouble(4, std.getSmarks());
			ps.setString(5, std.getSloc());
			int row = ps.executeUpdate();
			System.out.println(row);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}  
