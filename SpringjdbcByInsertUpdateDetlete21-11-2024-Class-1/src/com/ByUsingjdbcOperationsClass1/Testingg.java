package com.ByUsingjdbcOperationsClass1;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testingg
{
	
	
	
	public static void main(String[] args) throws Throwable
	{
		System.out.println("----Started----");
		
		
		ApplicationContext on = new AnnotationConfigApplicationContext(getConfiguration.class);
		
		
//		Dao d = on.getBean(Dao.class);
//		d.m1();
		
				Controller cc	=	on.getBean(Controller.class);
//				
//					cc.save(new StudentPojo(101, "RajaGopal", 27, "HYD"));
//				
//				cc.update(23, "GNT", 3);
		
				//cc.delete(199);
				
				cc.getbyId(5);
				
				cc.getAll();
		
		
		System.out.println("----Ended----");
		
	}

}
