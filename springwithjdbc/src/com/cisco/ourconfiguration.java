package com.cisco;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cisco")
public class ourconfiguration {
	
	@Bean
	public DataSource datasource() {
		
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		ds.setUrl("jdbc:mysql://localhost:3306/slokam1");
		
		ds.setUsername("root");
		ds.setPassword("sai@123");
		
		return ds;
	}

}
