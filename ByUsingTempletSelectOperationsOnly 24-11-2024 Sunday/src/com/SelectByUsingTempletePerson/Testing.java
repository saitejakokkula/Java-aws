package com.SelectByUsingTempletePerson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testing
{

	public static void main(String[] args)
	{
		ApplicationContext on = new AnnotationConfigApplicationContext(GetConfiguration.class);
		
					Controller	cc		=	on.getBean(Controller.class);
					
			//		cc.OnerowOneColuman(1);
					
				//	cc.OneEmployedata(1);
					
				//	cc.Maxesal();
					
				//	cc.Minesal();
					
				//	cc.countperson();
					
					//cc.sumage();
					
				//	cc.allempdata();
					
				//	cc.getallnocolumnmatch();
					
				//	cc.multirscolu();
					
				//	cc.pnameagenumber();
					
					cc.pnamepagenumber(1);
	}

}
