package com.ByUsingjdbcOperationsClass1;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ByUsingjdbcOperationsClass1")
public class getConfiguration 
{
	
	
	
		@Bean
		public BasicDataSource datasource()
		{
			BasicDataSource  d = new BasicDataSource();
			
			d.setDriverClassName("com.mysql.cj.jdbc.Driver");
			
			d.setUrl("jdbc:mysql://localhost:3306/springjdbc");
			
			d.setUsername("root");
			
			d.setPassword("root");
			
			//d.setInitialSize(50);
				
			return d;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
