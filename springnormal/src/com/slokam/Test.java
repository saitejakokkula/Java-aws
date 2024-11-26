package com.slokam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext on = new AnnotationConfigApplicationContext(ourConfiguration.class);
		
		manager m = on.getBean(manager.class);
		
		m.dowork();

	}

}
