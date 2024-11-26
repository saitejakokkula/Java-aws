package com.cisco;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		

		ApplicationContext on = new AnnotationConfigApplicationContext(ourconfiguration.class);
		
		
					manager men	=	on.getBean(manager.class);
					
					men.workdone();
					
					System.out.println("--------------------------");
					String   data	=	(String) on.getBean("the");
					
					System.out.println(data);
					
					System.out.println("--------------------------");
					
					
					ArrayList<String> devv = (ArrayList<String>) on.getBean("two");
					
					System.out.println(devv);
					
					System.out.println("---------------------");
	
	}


}
