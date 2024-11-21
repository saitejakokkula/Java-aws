package ByUsingTempletsSecondClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service
{
	@Autowired
	private Dao de;
	
	public void save(StudentPojo std)
	{
		System.out.println("---This is Service save the data---"+std);
		
		de.save(std);
	}
	
	
	public void update(int sage, String sloc, int sid)
	{
	
		System.out.println("----This is Controller to update----"+sid);
		de.update(sage, sloc, sid);
		
	}
	
	public void delete(int sid)
	{
		System.out.println("----This is Controller to Delete---"+sid);
		de.delete(sid);
	}
	

}
