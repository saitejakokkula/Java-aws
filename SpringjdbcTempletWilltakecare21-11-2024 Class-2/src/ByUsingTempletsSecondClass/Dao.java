package ByUsingTempletsSecondClass;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Dao
{
	@Autowired
	private JdbcTemplate jdbc;
	
	
	//private DataSource ds;
	
	public void save(StudentPojo std)
	{
		System.out.println("---This is Dao Class---");
		jdbc.update("insert into springjdbc.studentpojo values (?,?,?,?);",std.getSid(),std.getSname(),std.getSage(),std.getSloc());
		
		System.out.println("Data is inserted succesfullyy =="+std);
	}
	
	
	public void update(int sage, String sloc, int sid)
	{
	
		System.out.println("----This is Controller to update----"+sid);
		
		jdbc.update("update  springjdbc.studentpojo set sage = ? ,sloc =? where sid= ?",sage,sloc,sid);
		
		System.out.println("---Data is Updated Succefullyy---"+sid);	
	}
	
	
		public void delete(int sid)
		{
			System.out.println("----This is Controller to Delete---"+sid);
			
			jdbc.update("delete from springjdbc.studentpojo where sid =? ;",sid);
			
			System.out.println("---data is deleted Succefully---"+sid);
		}
	

}
