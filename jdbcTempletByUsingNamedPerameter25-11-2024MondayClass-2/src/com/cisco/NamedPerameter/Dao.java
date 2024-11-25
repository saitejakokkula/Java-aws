package com.cisco.NamedPerameter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Dao
{
	
	@Autowired
	private NamedParameterJdbcTemplate jtemp;
	
	public PersonPojo save(PersonPojo poj)
	{
		//This is Named Perameters //
		
		String query = "insert into springjdbc1.personpojo values(:pid,:pname,:pagee,:pmob,:ploc);";
		System.out.println("This is deo Class");
		
		//We take one map Resource perameter //
		MapSqlParameterSource mp = new MapSqlParameterSource();
		
		mp.addValue("pid",poj.getPid());
		mp.addValue("pname", poj.getPname());
		mp.addValue("pagee", poj.getPagee());
		mp.addValue("pmob", poj.getPmob());
		mp.addValue("ploc", poj.getPloc());
		
		
		jtemp.update(query, mp);
		return poj ;
	}
	
	public PersonPojo update(int pagee,long pmob,int pid)
	{
		System.out.println("This is Dao Class");
		
		
		String Query = "update springjdbc1.personpojo set pagee = :pagee ,pmob = :pmob where pid = :pid";
		MapSqlParameterSource mp = new MapSqlParameterSource();
		
		mp.addValue("pagee", pagee);
		
		mp.addValue("pmob", pmob);
		
		mp.addValue("pid", pid);
		
		jtemp.update(Query, mp);
		
		System.out.println("-----------");
		
		PersonPojo p = new PersonPojo();
		p.setPagee(pagee);
		p.setPmob(pmob);
		p.setPid(pid);
		return p;
				
	}
	
	
	
	public void delete(int pid)
	{
		System.out.println("This is Dao---");
		
		String data = "delete from  springjdbc1.personpojo where pid =:pid";
	
		MapSqlParameterSource mp = new MapSqlParameterSource();
		
		mp.addValue("pid",pid);
		
		jtemp.update(data, mp);
		
		System.out.println("----This is Deleted ----");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
