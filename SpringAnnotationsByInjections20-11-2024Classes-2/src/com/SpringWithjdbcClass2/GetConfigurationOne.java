package com.SpringWithjdbcClass2;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.SpringWithjdbcClass2")
public class GetConfigurationOne {
	
	
	
	@Bean
	public DataSource datasource()
	{
		
		
		BasicDataSource s = new BasicDataSource();
		
		s.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		s.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		
		s.setUsername("root");
		
		s.setPassword("root");
		
		return s;
	}

}
