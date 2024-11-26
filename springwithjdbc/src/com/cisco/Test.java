package com.cisco;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext a = new AnnotationConfigApplicationContext(ourconfiguration.class);
		controller c =  a.getBean(controller.class);
		//c.save(new employeepojo(4, "madhu", 26, "database"));
		//c.update(26, "devops", 2);
		//c.delete(3);
		//c.getById(4);
		c.getall();

	}

}
