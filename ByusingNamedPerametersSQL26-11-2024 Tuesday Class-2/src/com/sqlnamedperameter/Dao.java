package com.sqlnamedperameter;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class Dao
{
	@Autowired
	public NamedParameterJdbcTemplate pjtemp;
	
	public PersonPojo save(PersonPojo poj)
	{
		System.out.println("This is Dao is Started");
		
		String query ="insert into  springjdbc1.personpojo values(:pid,:pname,:pagee,:pmob,:ploc);";
		
		SqlParameterSource a = new BeanPropertySqlParameterSource(poj);
		
				 pjtemp.update(query, a);
				 
		System.out.println("---This is Dao is Ended--");
				 
		return poj;
	}
	
	
	public void update(int pid,int pagee,String ploc)
	{
		System.out.println("This is Dao ");
		System.out.println("Started ");
		
		String query ="update springjdbc1.personpojo set pagee = :pagee,ploc =:ploc where pid =:pid";
		
		PersonPojo poj = new PersonPojo();
		poj.setPid(pid);
		poj.setPagee(pagee);
		poj.setPloc(ploc);
		
		
		SqlParameterSource p = new BeanPropertySqlParameterSource(poj);

		pjtemp.update(query, p);
		
		System.out.println("Ended");
	}
	
	
	
	
	public void delete(int pid)
	{
		System.out.println("This is controller ");
		System.out.println("Started ");
		
		String query = "delete from springjdbc1.personpojo where pid = :pid";
		
		PersonPojo poj = new PersonPojo();
		
		poj.setPid(pid);
		
		
		SqlParameterSource a = new BeanPropertySqlParameterSource(poj);
		
		pjtemp.update(query, a);
		
		System.out.println("Ended ");

	}
	
	
	//------------------------------------------------------//
	
	//One row with all columns is For QueryforObject .
	
	
	public PersonPojo oneCompleteRow(int pid)
	{
		
		System.out.println("This is deo Class");
		System.out.println("This Started");
		
		String query = "select * from springjdbc1.personpojo where pid = :pid";
		
		PersonPojo p = new PersonPojo();
		p.setPid(pid);
		
		SqlParameterSource pp = new BeanPropertySqlParameterSource(p);
		
		return	pjtemp.queryForObject(query, pp, new BeanPropertyRowMapper<PersonPojo>(PersonPojo.class));		
	}
	
	//One Row with One Column is Also QueryforObject //
	
	public String pname(int pid)
	{
		System.out.println("This is deo Class");
		System.out.println("This is Started Class");
		
		String query = "select pname from springjdbc1.personpojo where pid = :pid ";
		
		PersonPojo p = new PersonPojo();
		p.setPid(pid);
		
		SqlParameterSource pp = new BeanPropertySqlParameterSource(p);
		
		return pjtemp.queryForObject(query, pp, String.class);
		
	}
	
	//-------------------------------------------------------//
	
	
	//Multiple rows with all columns by using query ./
	
	public List<PersonPojo> GetAll()
	{
		System.out.println("This is Deo Class");
		
		String query = "select * from springjdbc1.personpojo";
		
		PersonPojo p = new PersonPojo();
		
		SqlParameterSource sp = new BeanPropertySqlParameterSource(p);
		
		return pjtemp.query(query, sp,new BeanPropertyRowMapper<PersonPojo>(PersonPojo.class));
	}
	
	
	//By Using RowMapInterface //
	
	public List<PersonPojo> GetAllRowMapInterface()
	{
		System.out.println("This is Deo Class");
		
		String query = "select * from springjdbc1.personpojo ";
		
		PersonPojo poj = new PersonPojo();
		
		SqlParameterSource  sc = new BeanPropertySqlParameterSource(poj);
		
		return pjtemp.query(query, sc, new ourRowMap());
	}
	
	
	//-----------------------------------------------------//
	
	
	//By using multi rows with single column //
	
	
	public List<Map<String, Object>> multirows()
	{
		System.out.println("This is Dao Class");
		
		String query = "select pname from springjdbc1.personpojo";
		
		PersonPojo p = new PersonPojo();
		
		SqlParameterSource sp = new BeanPropertySqlParameterSource(p);
		
		return pjtemp.queryForList(query, sp);
	}
	
	
	//Multi rows with multi Columns //
	
	
	public List<Map<String, Object>> MultiColumns()
	{
		System.out.println("this is deo Class");
		
		String query = "select pname,pagee,ploc from springjdbc1.personpojo";
		
		PersonPojo poj = new PersonPojo();
		
		SqlParameterSource sp = new BeanPropertySqlParameterSource(poj);
		
		return pjtemp.queryForList(query, sp);
	}
	
	//Multi columns with One row Only //
	
	public List<Map<String, Object>> MulticolOneRow(int pid)
	{
		
		System.out.println("This is Deo Class");
		
		String query ="select pname,pagee from springjdbc1.personpojo where pid = :pid ";
		
		PersonPojo poj = new PersonPojo();
		
		poj.setPid(pid);
		
		SqlParameterSource sp = new BeanPropertySqlParameterSource(poj);
		
		return pjtemp.queryForList(query, sp);
	}
	
	
	
}
