package com.ByUsingjdbcOperationsClass1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dao {
	
	
	@Autowired
	private BasicDataSource datasource;
	
	
//	public void m1() throws SQLException {
//		
//		System.out.println(datasource.getConnection());
//		System.out.println(datasource.getConnection());
//	}
//	
	
	//
	public void save(StudentPojo std)
	{
		
		System.out.println("---This is Dao Class method ---"+ datasource.getNumActive());
		
		try
		{
			Connection con = datasource.getConnection();
					
			System.out.println(con);
			
			PreparedStatement ps =	con.prepareStatement("insert springjdbc.studentpojo values (?,?,?,?);");
			
			ps.setInt(1, std.getSid());
			ps.setString(2, std.getSname());
			ps.setInt(3, std.getSage());
			ps.setString(4, std.getSloc());
			
			
				int row	=	ps.executeUpdate();
				
				System.out.println(row);		
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	
	
	
	//Updateing the data //
	public void update(int sage, String sloc, int sid)
		{
			System.out.println("---Updateing the Dao Class---"+sid);
			
			try
			{
			Connection con = datasource.getConnection();
			
			PreparedStatement ps	=	con.prepareStatement("update springjdbc.studentpojo set sage =? ,sloc = ? where sid =?;");
				ps.setInt(1, sage);
				ps.setString(2, sloc);
				ps.setInt(3, sid);
				
				int a = ps.executeUpdate();
				
				System.out.println("Updated is ="+a);
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}
		
		}
	
	
	
		public void delete(int sid)
			{
				System.out.println("---Deleting the Controller---"+sid);	
				try
				{
					Connection con = datasource.getConnection();
					
				PreparedStatement ps  =	con.prepareStatement("delete from springjdbc.studentpojo where sid =? ;");
				
				ps.setInt(1, sid);
				
				int rows		=		ps.executeUpdate();
				
				System.out.println("---Updated Rows is---"+rows);
				}
				catch(SQLException e)
				{
					System.out.println(e);
				}	
			}
		
		
		
		public void getbyId(int sid)
		{
			System.out.println("----Dao data is getbyId---"+sid);
			
			
			try
			{
				Connection con		=	datasource.getConnection();
									
				System.out.println("-----connected--------");
				
				PreparedStatement ps	=	con.prepareStatement("select * from springjdbc.studentpojo where sid = ?;");
				ps.setInt(1, sid);
				
					ResultSet ra	=	ps.executeQuery();
					
					while(ra.next())
					{
						System.out.println(ra.getInt("sid"));
						System.out.println(ra.getString("sname"));
						System.out.println(ra.getInt("sage"));
						System.out.println(ra.getString("sloc"));	
					}		
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}
		}
		
		
		
		
		public void getAll() 
		{
			
			System.out.println("----Controller data by Using GetAll----");
			
			try
			{
				Connection con = datasource.getConnection();
				
				PreparedStatement  ps   =	con.prepareStatement("select * from springjdbc.studentpojo;");
				
					   ResultSet rs	 =	ps.executeQuery();
					   
					   
					while(rs.next())
					{
						System.out.println(rs.getInt("sid"));
						System.out.println(rs.getString("sname"));
						System.out.println(rs.getInt("sage"));
						System.out.println(rs.getString("sloc"));
						
						System.out.println("-------------------");
					}
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}
			
			
			
		}


}
