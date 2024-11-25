package com.UpdateByUsingTempletePerson;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan("com.UpdateByUsingTempletePerson")
public class GetConfiguration
{
	
	
	
	
	@Bean
	public DataSource datsource()
	{
		
		BasicDataSource b = new BasicDataSource();
		
			b.setDriverClassName("com.mysql.cj.jdbc.Driver");
			
			b.setUrl("jdbc:mysql://localhost:3306/springjdbc1");
			
			b.setUsername("root");
			
			
			b.setPassword("root");
		
			return b;
	}
	
	
	
			@Bean
			public JdbcTemplate jtemp()
			{
				return new JdbcTemplate(datsource());
			}
	
	
	

}
