package com.cisco;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext as = new AnnotationConfigApplicationContext(ourconfiguration.class);
		
	   // controller cs =  as.getBean(controller.class);
//    employeepojo emp =   cs.save(new employeepojo(23, "saha", 25, "dev"));
//    System.out.println(emp);
	   // cs.update(36, "fullstackjava", 6);
	   // cs.delete(12);
	    //cs.getByid(6);
	    //cs.getByname(3);
	    deo d = as.getBean(deo.class);
	    d.getAll();
	}

}
