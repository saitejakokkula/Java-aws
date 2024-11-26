package com.cisco;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class deo {
	
	@Autowired
	private NamedParameterJdbcTemplate njdbc;

	public employeepojo save(employeepojo emp) {
		
		//System.out.println("named parameter temp object--"+njdbc);
		
		MapSqlParameterSource p = new MapSqlParameterSource();
		p.addValue("sid", emp.getSid());
		p.addValue("sname", emp.getSname());
		p.addValue("sage", emp.getSage());
		p.addValue("scource", emp.getScourse());
		njdbc.update("insert into slokam1.student values(:sid,:sname,:sage,:scource)", p);

		System.out.println("I am in deo class---"+emp);
		return emp;
	}

	public void update(int sage, String scourse, int sid) {
		
		System.out.println(" I am in deo class update started..!");
		String sql = "update slokam1.student set sage = :sage, scourse = :scourse where sid = :sid";
		
		MapSqlParameterSource s = new MapSqlParameterSource();
		s.addValue("sage", sage);
		s.addValue("scourse", scourse);
		s.addValue("sid", sid);
		
		njdbc.update(sql, s);
		
		System.out.println("I am in deo class update completed..!");
		
	}

	public void delete(int sid) {
		
		System.out.println("I am in deo class delete started..!");
		
		String sql = "delete from slokam1.student where sid = :sid";
		
		MapSqlParameterSource s = new MapSqlParameterSource();
		s.addValue("sid", sid);
		
		njdbc.update(sql, s);
		
		System.out.println("I am in deo class delete completed...!");
	}

	public employeepojo getByid(int sid) {
		
       
		
		String sql = "select * from slokam1.student where sid = :sid";
		
		MapSqlParameterSource s = new MapSqlParameterSource();
		s.addValue("sid", sid);
		
		employeepojo emp = 	njdbc.queryForObject(sql, s, new BeanPropertyRowMapper<employeepojo>(employeepojo.class));
		System.out.println(emp);
		
		return emp;
		
		
	}

	public void getByname(int sid) {
		
		    
			
			String sql = "select sname from slokam1.student where sid = :sid";
			
			MapSqlParameterSource s = new MapSqlParameterSource();
			s.addValue("sid", sid);
			
	       String emp = njdbc.queryForObject(sql, s, String.class);
			System.out.println(emp);			
		
	}
	
	public List<employeepojo> getAll() {
		
		String sql = "select * from slokam1.student";
		
		MapSqlParameterSource s = new MapSqlParameterSource();
		
		return njdbc.query(sql, new ourRowmapper());
	}

}
