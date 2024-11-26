package com.cisco;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
@ComponentScan("com.cisco")
public class ourconfiguration {
	
	@Bean
	public DataSource dataSource() {
		
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/slokam1");
		ds.setUsername("root");
		ds.setPassword("sai@123");
		
		return ds;
		
	}
	
	@Bean
	public NamedParameterJdbcTemplate namedparameterJdbcTemplate() {
		
		NamedParameterJdbcTemplate n = new NamedParameterJdbcTemplate(dataSource());
		
		return n;
	}

}
