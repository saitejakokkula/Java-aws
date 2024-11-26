package com.UpdateandSelect;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OurRowMap implements RowMapper<PersonPojo>
{

	@Override
	public PersonPojo mapRow(ResultSet rs, int arg1) throws SQLException
	{
		
		PersonPojo poj = new PersonPojo();
		poj.setPid(rs.getInt("pid"));
		poj.setPname(rs.getString("pname"));
		poj.setPagee(rs.getInt("pagee"));
		poj.setPmobb(rs.getLong("pmob"));
		poj.setPloc(rs.getString("ploc"));
		
		return poj;
	}

}
