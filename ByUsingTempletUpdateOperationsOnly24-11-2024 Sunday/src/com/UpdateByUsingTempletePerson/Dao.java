package com.UpdateByUsingTempletePerson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Dao
{
	
	@Autowired
	private JdbcTemplate jtemp;
	
	/*	Here we bring the Conncetion we give a datasource it is injected jdbc templet.
	 * 	Now We are using jdbcTemplet.
	 * 	Connection Got to the jdbc Templet.
	 * Templet is Handles the Exceptions.
	 * Templet is Taking the preparestatement.
	 * we provide Query for the prepare statement.
	 * set perameters it will be take templet but we mention which is take like getid(),getname() like.
	 * Templet Provide Execute Update.
	 * 
	 */
	
	public void Save(PersonPojo poj)
	{
		
		System.out.println("--This is Dao Save --");
				
		jtemp.update("insert into springjdbc1.personpojo values(?,?,?,?,?)", poj.getPid(),poj.getPname(),poj.getPagee(),poj.getPmob(),poj.getPloc());
		
		System.out.println("Data is saved Succefully ");
	}
	
	
	
	public void update(int pagee,long pmob,int pid)
	{
		System.out.println("---this Is Dao update Option---");
		
				jtemp.update("update springjdbc1.personpojo set pagee = ?,pmob = ? where  pid = ? ", pagee,pmob,pid);
				
				System.out.println("Data is saved Succefully ");
	}
	
	
	
	public void delete(int pid)
	{
		System.out.println("This is Dao Classs --Delete Option--");
		
				jtemp.update("delete from  springjdbc1.personpojo where pid = ? ",pid );
				
				System.out.println("Data is saved Succefully ");
		
	}

}
