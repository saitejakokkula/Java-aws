package com.cisco;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class deo {
	
	@Autowired
	private NamedParameterJdbcTemplate njdbc;

	public employeepojo save(employeepojo emp) {
		
		//System.out.println("named parameter temp object--"+njdbc);
		
		SqlParameterSource s = new BeanPropertySqlParameterSource(emp);
		String sql = "insert into slokam1.student values(:sid,:sname,:sage,:scourse)";
		
		njdbc.update(sql, s);

		System.out.println("I am in deo class---"+emp);
		return emp;
	}

	public void update(int sage, String scourse, int sid) {
		
		System.out.println(" I am in deo class update started..!");
		employeepojo emp = new employeepojo();
		emp.setSage(sage);
		emp.setScourse(scourse);
		emp.setSage(sage);
		String sql = "update slokam1.student set sage = :sage, scourse = :scourse where sid = :sid";
		
		SqlParameterSource s = new BeanPropertySqlParameterSource(emp);
		
		
		njdbc.update(sql, s);
		
		System.out.println("I am in deo class update completed..!");
		
	}

	public void delete(int sid) {
		
		System.out.println("I am in deo class delete started..!");
		employeepojo emp = new employeepojo();
		emp.setSid(sid);
		String sql = "delete from slokam1.student where sid = :sid";
		
		SqlParameterSource s = new BeanPropertySqlParameterSource(emp);
		
		njdbc.update(sql, s);
		
		System.out.println("I am in deo class delete completed...!");
	}

	public employeepojo getByid(int sid) {
		
       employeepojo emp = new employeepojo();
       emp.setSid(sid);
		
		String sql = "select * from slokam1.student where sid = :sid";
		
		SqlParameterSource s = new BeanPropertySqlParameterSource(emp);
		
		employeepojo emp1 = 	njdbc.queryForObject(sql, s, new BeanPropertyRowMapper<employeepojo>(employeepojo.class));
		System.out.println(emp1);
		
		return emp1;
		
		
	}

	public void getByname(int sid) {
		
		
		   employeepojo emp = new employeepojo();
	       emp.setSid(sid);
		   String sql = "select sname from slokam1.student where sid = :sid";
			
		   SqlParameterSource s = new BeanPropertySqlParameterSource(emp);
			
	       String emp1 = njdbc.queryForObject(sql, s, String.class);
			System.out.println(emp1);			
		
	}
	
	public List<employeepojo> getAll() {
		
		String sql = "select * from slokam1.student";

		List<employeepojo> empList = njdbc.query(sql, new ourRowmapper());

	    // Use an iterator to iterate over the list
		 Iterator<employeepojo> a = empList.iterator();
		 
		 while(a.hasNext()) {
			 
			 System.out.println(a.next());
		 }
	    
	    return empList;
		
	}

}
