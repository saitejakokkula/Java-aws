package com.UpdateandSelect;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testing
{
	
	public static void main(String[] args)
	{
		
		
		ApplicationContext on = new AnnotationConfigApplicationContext(GetConfiguration.class);
		
			Controller cc			=	on.getBean(Controller.class);
		//PersonPojo pp	=cc.save(new PersonPojo(21, "Devaa", 24, 9999, "nrt"));
		
		//System.out.println("Data is Back"+pp);
			
							//	cc.update(21, 30, "hydd");
			
			//cc.delete(21);
		
//			PersonPojo p=cc.onedata(1);
//			
//			System.out.println("Data is Back="+p);
			
			
//	String name 	=	cc.pname(1);
//	
//	System.out.println(name);
//		
//		List<PersonPojo> data =	cc.alldata1();
//		
//		Iterator<PersonPojo>  dd =	data.iterator();
//		
//		while(dd.hasNext())
//		{
//			System.out.println(dd.next());
//		}
		
	List<Map<String, Object>>		data		=	cc.MulticoluOneRow(1);
	
	
					Iterator<Map<String, Object>>	haa			=	data.iterator();
					
					while(haa.hasNext())
					{
						System.out.println(haa.next());
					}
		
			
			
	}

}
