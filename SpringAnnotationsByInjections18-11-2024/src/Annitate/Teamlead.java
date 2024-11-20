package Annitate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teamlead 
{
	
	@Autowired
	private Devloper dev;
	
	
	public void dowork()
	{
		System.out.println("Start the Teamlead");
		dev.dowork();
		System.out.println("Ended the Teamlead");
	}

}
