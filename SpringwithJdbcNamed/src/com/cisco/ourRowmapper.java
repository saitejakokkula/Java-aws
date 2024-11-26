package com.cisco;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ourRowmapper implements RowMapper<employeepojo> {

	@Override
	public employeepojo mapRow(ResultSet rs, int arg1) throws SQLException {
		
		employeepojo emp = new employeepojo();
		emp.setSid(rs.getInt("sid"));
		emp.setSname(rs.getString("sname"));
		emp.setSage(rs.getInt("sage"));
		emp.setScourse(rs.getString("scourse"));
		
		return emp;
	}

}
