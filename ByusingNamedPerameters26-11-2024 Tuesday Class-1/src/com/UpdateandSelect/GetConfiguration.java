package com.UpdateandSelect;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
@ComponentScan("com.UpdateandSelect")
public class GetConfiguration
{
	
	@Bean
	public DataSource dataSource()
	{
		
		BasicDataSource b = new BasicDataSource();
		
			b.setDriverClassName("com.mysql.cj.jdbc.Driver");
			b.setUrl("jdbc:mysql://localhost:3306/springjdbc1");
			b.setUsername("root");
			b.setPassword("root");
			
			return b;
			
	}
	
	
	@Bean
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate()
	{
		return new NamedParameterJdbcTemplate(dataSource());
	}
	

}
