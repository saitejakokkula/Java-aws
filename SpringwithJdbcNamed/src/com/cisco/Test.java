package com.cisco;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext as = new AnnotationConfigApplicationContext(ourconfiguration.class);
		
	    //controller cs =  as.getBean(controller.class);
//	    employeepojo emp =   cs.save(new employeepojo(22, "mozi", 25, "hr"));
//	    System.out.println("Data saved back to UI"+emp);
	    
	    //cs.update(25, "devops", 5);
	    // cs.delete(5);
	   // cs.getByid(6);
	    //cs.getByname(4);
		
	 deo d = as.getBean(deo.class);
	 List<employeepojo> data=d.getAll();
	 System.out.println(data);

	}

}
