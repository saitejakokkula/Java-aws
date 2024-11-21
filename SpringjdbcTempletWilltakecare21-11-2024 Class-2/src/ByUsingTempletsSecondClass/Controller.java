package ByUsingTempletsSecondClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller
{
	@Autowired
	private Service se;
	
	public void save(StudentPojo std)
	{
		
		System.out.println("---This is Controller save the data---"+std);
		
		se.save(std);
	}
	
	public void update(int sage, String sloc, int sid)
	{
		System.out.println("----This is Controller to update----"+sid);
		se.update(sage, sloc, sid);		
	}
	
	
		public void delete(int sid)
		{
			System.out.println("----This is Controller to Delete---"+sid);
			se.delete(sid);
		}
	
	
	
}
