package com.cisco;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cisco")
public class ourconfiguration {
	
	
	@Bean
	public manager manager() {
		
		return new manager();
		
	}
	
	@Bean
	public teamlead teamlead() {
		
		return new teamlead();
	}
	@Bean
	public deveploer deveploerone() {
		
		return new deveploer();
	}
	
	
	@Bean(name = "is")
	public String getname()
	{
		
		String s;
		
		
		s = new String("SLOKAM TECHNOLOGYS");
		
			return s;
	}
	
	
	@Bean(name = "the")
	public String getnameone()
	{
		
		String s;
		
		
		s = new String("SLOKAM INSTUTIONS");
		
			return s;
	}
	
	
	
	@Bean(name = "one")
	public ArrayList<String> Arraylistone(){
		
		ArrayList<String> b = new ArrayList<>();
		
		b.add("sai");
		b.add("akshu");
		b.add("ram");
		
		return b;
	}
	
	@Bean(name = "two")
     public ArrayList<String> Arraylisttwo(){
		
		ArrayList<String> b = new ArrayList<>();
		
		b.add("sam");
		b.add("raghu");
		b.add("ram");
		
		return b;
	 }
	 
	
	


}
