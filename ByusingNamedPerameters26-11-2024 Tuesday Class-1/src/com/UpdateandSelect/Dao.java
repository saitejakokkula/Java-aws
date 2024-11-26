package com.UpdateandSelect;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Dao
{
	///Save Method  By Using Update//
	
	@Autowired
	public NamedParameterJdbcTemplate pjtemp;
	
	public PersonPojo save(PersonPojo poj)
	{
		System.out.println("Save Operation Started");
		System.out.println("This is deo Class");
		
		String Query ="insert into  springjdbc1.personpojo values(:pid,:pname,:pagee,:pmob,:ploc)";
		
		
		MapSqlParameterSource mp = new MapSqlParameterSource();
		
		mp.addValue("pid", poj.getPid());
		mp.addValue("pname", poj.getPname());
		mp.addValue("pagee", poj.getPagee());
		mp.addValue("pmob", poj.getPmobb());
		mp.addValue("ploc", poj.getPloc());
		
		
		pjtemp.update(Query, mp);
		
		System.out.println("Save Operation Ended");
		return poj;
	}
	
	
	
	//Update Method  By Using Update//
	
	public void update(int pid,int pagee,String ploc)
	{
		System.out.println("Update Operation is Started");
		
		String Query = "update springjdbc1.personpojo set pagee =:pagee ,ploc = :ploc where pid = :pid";
		
		
		MapSqlParameterSource mp = new MapSqlParameterSource();
		
		mp.addValue("pagee", pagee);
		mp.addValue("ploc", ploc);
		mp.addValue("pid", pid);
		
		
		pjtemp.update(Query, mp);
		
		System.out.println("Update Operation is Ended");
		
		
	}
	
			//Delete  //By Using Update //
	
	public void delete(int pid)
	{
		
		System.out.println("This is Started class");
		System.out.println("This is Deo class");
		
		String query = "delete from springjdbc1.personpojo where pid = :pid";
		
		MapSqlParameterSource mp = new MapSqlParameterSource();
		mp.addValue("pid", pid);
		
		pjtemp.update(query, mp);
		
		System.out.println("This is Ended class");
		
		
	}
	
	//------------------------------------------------------------//
	//One row with Multi columns //
	
	public PersonPojo onedata(int pid)
	{
		
		System.out.println("This is Started class");
		System.out.println("This is Deo class");
		
		String query = "select * from springjdbc1.personpojo where pid = :pid";
		
		MapSqlParameterSource mp = new MapSqlParameterSource();
		
		mp.addValue("pid",pid);
		
		return pjtemp.queryForObject(query, mp, new BeanPropertyRowMapper<PersonPojo>(PersonPojo.class));
		
	}
	
	
	//One row With One Column By Using QueryForObject //
	
	public String pname(int pid)
	{
		
		
		System.out.println("This is Started class");
		System.out.println("This is Deo class");
		
		String Query = "select pname from  springjdbc1.personpojo where pid =:pid;";
		
		
		MapSqlParameterSource mp = new MapSqlParameterSource();
		
		mp.addValue("pid",pid);
		
		return pjtemp.queryForObject(Query, mp, String.class);
		
	}
	
	//------------------------------------------------------//
	
	//)Multiple rows with all columns by Using Query //
	
	public List<PersonPojo> alldata()
	{
		System.out.println("This is Started class");
		System.out.println("This is Deo class");
		
		MapSqlParameterSource mp = new MapSqlParameterSource();
		
		String Query = "select * from springjdbc1.personpojo;";

		return pjtemp.query(Query,new BeanPropertyRowMapper<PersonPojo>(PersonPojo.class));
		
	}
	
	
		//Multiple rows with all columns by Using
		//Query by using RowMap interface //
	public List<PersonPojo> alldata1()
	{
		System.out.println("This is Started class");
		System.out.println("This is Deo class");
		
		MapSqlParameterSource mp = new MapSqlParameterSource();
		
		String Query = "select * from springjdbc1.personpojo;";
		
		return pjtemp.query(Query,new OurRowMap());
	
	}	
	
	//------------------------------------------------------------------//

	//I am Using queryforlist() by using tjhe list.
	//For this one is no need of Pojo class//
	
	//Multiple rows with single column //
	
	
	public List<Map<String, Object>> allpname()
	{
		System.out.println("This is Started class");
		System.out.println("This is Deo class");
		
		String query = "select pname from springjdbc1.personpojo ";
		
		MapSqlParameterSource mp = new MapSqlParameterSource();
		
			
		
		return pjtemp.queryForList(query,mp);
		
	}
	
	
	//Multiple rows with all columns //
		
	public List<Map<String, Object>> MultiPnamePage()
	{
		System.out.println("This is Started class");
		System.out.println("This is Deo class");
		
		String query = "select pname,pagee from springjdbc1.personpojo ";
		
		MapSqlParameterSource mp = new MapSqlParameterSource();
		
		return pjtemp.queryForList(query, mp);
		
	}
	
	//--------------------------------------------------------------------//
	
	
	//One row with multiple Columns //
	
	public List<Map<String, Object>> MulticoluOneRow(int pid)
	{
		System.out.println("This is Started class");
		System.out.println("This is Deo class");
		
		String query = "select pname,pagee from springjdbc1.personpojo where pid = :pid";
		
		MapSqlParameterSource mp = new MapSqlParameterSource();
		
			mp.addValue("pid", pid);
		
		return pjtemp.queryForList(query, mp);
	}

	
	
	
}
