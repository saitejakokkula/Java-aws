package ByUsingTempletsSecondClass;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan("ByUsingTempletsSecondClass")
public class GetConfiguration
{
	
	@Bean
	public DataSource datasource()
	{
		BasicDataSource a = new BasicDataSource();
		
		a.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		a.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		
		a.setUsername("root");
		
		a.setPassword("root");
		
//		System.out.println("**************************************************************************");
//		System.out.println(a.getNumActive());
//		
//		System.out.println("**************************************************************************");
		
		return a;
	}
	
	
	@Bean
	public JdbcTemplate  jdbct()
	{
		
		return new JdbcTemplate(datasource());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
