package com.SelectByUsingTempletePerson;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OurRowMapper implements RowMapper<PersonPojo>
{

	@Override
	public PersonPojo mapRow(ResultSet rs , int arg1) throws SQLException
	{
		
		PersonPojo p = new PersonPojo();
		p.setPid(rs.getInt("pid"));
		p.setPname(rs.getString("pname"));
		p.setPagee(rs.getInt("pagee"));
		p.setPmob(rs.getLong("pmob"));
		p.setPloc(rs.getString("ploc"));
		
		return p;
	}
	
	

}
