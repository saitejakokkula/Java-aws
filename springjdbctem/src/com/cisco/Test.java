package com.cisco;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext a = new AnnotationConfigApplicationContext(ourconfiguration.class);
		controller c =  a.getBean(controller.class);
		//c.save(new employeepojo(6, "samu", 26, "jdbc"));
		//c.update(22, "devops", 6);
		//c.delete(1);
		//c.getname(2);
		//c.getage(5);
		//c.getcount();
		//c.getEmpdata(5);
		//c.getallEmpdata();
		//c.getallEmpdata1();
		c.batchupdate();
		

	}

}
