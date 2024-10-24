package com.Deo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pojo.product;


public class productDeo {
	
	public void save(product pod) {
		System.out.println("I am in deo class"+pod);
		Connection con = getconnection.getconnect();
		try {
			PreparedStatement ps = con.prepareStatement("insert into skmart.product values(?,?,?,?,?,?,?)");
			ps.setInt(1, pod.getPid() );
			ps.setString(2, pod.getpname() );
			ps.setDouble(3, pod.getPprice());
			ps.setDouble(4, pod.getPgst());
			ps.setString(5, pod.getPvendor());
			ps.setString(6, pod.getPcountry() );
			ps.setString(7, pod.getPtype());
			int row =ps.executeUpdate();
			System.out.println("insert values:-"+row);
		}catch(SQLException e) {
		      System.out.println(e);
		}
	}
	
	
	public void update(int pid, double pprice, double pgst) {
		Connection con = getconnection.getconnect();
	    try {
	    	System.out.println("---Started-----");
			PreparedStatement ps =con.prepareStatement("update skmart.product set pprice = ?, pgst = ? where pid = ? ");
			ps.setDouble(1, pprice);
			ps.setDouble(2, pgst);
			ps.setInt(3, pid);
			ps.executeUpdate();
			System.out.println("----Ended----");
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}
	public void delete(int pid) {
		Connection con = getconnection.getconnect();
		try {
			System.out.println("----started---");
			PreparedStatement ps = con.prepareStatement("delete from skmart.product where pid = ?");
			ps.setInt(1, pid);
			ps.executeUpdate();
			System.out.println("---Ended");
		}catch(SQLException e) {
			System.out.println(e);
		}
		
	}
	public void getbyid(int pid) {
		Connection con = getconnection.getconnect();
		{
			try {
				System.out.println("---started----");
				PreparedStatement ps = con.prepareStatement("select * from skmart.product where pid = ?");
				ps.setInt(1, pid);
				ResultSet s = ps.executeQuery();
				while (s.next()) {
	                System.out.println(s.getInt("pid"));
	                System.out.println(s.getString("pname"));
	                System.out.println(s.getDouble("pprice"));
	                System.out.println(s.getDouble("pgst"));
	                System.out.println(s.getString("pvendor"));
	                System.out.println(s.getString("pcountry"));
	                System.out.println(s.getString("ptype"));
	                System.out.println("--------------------------------------");
	            }
				
				System.out.println("-----Ended-----");
			}catch(SQLException e) {
				System.out.println(e);
			}
		}
		
	}
	public void getalldata() {
		Connection con = getconnection.getconnect();
		try {
			System.out.println("----started---");
			PreparedStatement ps = con.prepareStatement("select * from skmart.product");
            ResultSet s = ps.executeQuery();
            while (s.next()) {
                System.out.println(s.getInt("pid"));
                System.out.println(s.getString("pname"));
                System.out.println(s.getDouble("pprice"));
                System.out.println(s.getDouble("pgst"));
                System.out.println(s.getString("pvendor"));
                System.out.println(s.getString("pcountry"));
                System.out.println(s.getString("ptype"));
                System.out.println("--------------------------------------");
            }
	       
	        System.out.println("---Ended----");
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		
	}

}
