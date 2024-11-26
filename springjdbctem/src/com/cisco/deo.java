package com.cisco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.poi.ss.formula.functions.Count;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class deo {
	
	@Autowired
	private JdbcTemplate jdbctemp;
	
	public void save(employeepojo emp) {
		
		System.out.println("deo work on jdbc opration---");
		jdbctemp.update("insert into slokam1.student values(?,?,?,?)", emp.getSid(), emp.getSname(), emp.getSages(), emp.getScourse());
		System.out.println("deo work is inserted---!");
		
		
	}

	public void update(int sage, String scourse, int sid) {
		
		System.out.println("deo work on jdbc opration---");
		jdbctemp.update("update slokam1.student set sage = ?, scourse = ? where sid = ?" , sage, scourse, sid);
		System.out.println("deo work is updated---!");
	}

	public void delete(int sid) {
		
		System.out.println("deo work on jdbc opration---");
		jdbctemp.update("delete from slokam1.student where sid = ?", sid);
		System.out.println("deo work is deleted---!");
		
	}
	
	public void getname(int sid) {
		
		System.out.println("deo work on jdbc opration");
		
		String s = jdbctemp.queryForObject("select sname from slokam1.student where sid = ?",String.class, sid);
		System.out.println(s);
	}
	
	public void getage(int sid) {
		
		System.out.println("deo work on jdbc operation");
		
		Double d = jdbctemp.queryForObject("select sage from slokam1.student where sid = ?", Double.class, sid);
		System.out.println(d);
	}
	public void getcount() {
		
		System.out.println("deo work on jdbc operation");
		
	    Long c =  jdbctemp.queryForObject("select count(*) from slokam1.student", Long.class);
	    System.out.println(c);
	}
	public void getEmpdata(int sid) {
		
		System.out.println("deo work on jdbc operation");
		
	 employeepojo emp =	jdbctemp.queryForObject("SELECT * FROM slokam1.student where sid = ?", new BeanPropertyRowMapper<>(employeepojo.class), sid);
	 System.out.println(emp);
	}
	public void getallEmpdata() {
		
		System.out.println("deom work on jdbc operation");
		
	    List<employeepojo>	data  = jdbctemp.query("select * from slokam1.student", new ourRowmapper());
	 
	 
	 
	  Iterator<employeepojo> s = data.iterator();
	  
	  while(s.hasNext()) {
		  
		  System.out.println(s.next());
	  }
	}
	
	public void getallEmpdata1() {
		
		
	List<Map<String, Object>> data =  jdbctemp.queryForList("select sname from slokam1.student");
	
	
	 Iterator<Map<String, Object>> a = data.iterator();
	 
	 while(a.hasNext()) {
		 
		 System.out.println(a.next());
	 }
	}
	
	public void batchupdate() {
		
		//get connection
		// Exception handling
		//prepared statement
		// set parameter
		//execute query batchupdate
		// close batchupdatte
		
		
		
		Object[] a = {11, "Goutham", 25,"aws"};
		Object[] b = {9, "madhavi", 24, "DAA"};
		Object[] c = {12, "surya",36,  "DSA" };
		
		List<Object[]> data = new ArrayList<>();
		data.add(a);
		data.add(b);
		data.add(c);
		
		jdbctemp.batchUpdate("insert into slokam1.student values(?,?,?,?)", data);
		
		System.out.println("insert data.....!");
	}
	
}
