package SpringBoot29_11_2024Class1.SpringBoot29_11_2024Class1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  -->The @RestController annotation in Spring is used to define a controller
 *  	 that handles HTTP requests and returns data (like JSON or XML) directly 
 *  	as a response, without needing to render a view.

	-->It is a combination of:
	1)@Controller: To indicate the class is a Spring MVC controller.
	 2)@ResponseBody: To send the method’s return value as the HTTP response body.


	i)Single-Line Definition:
		@RestController is an annotation in Spring that creates RESTful web services
		 	 by handling HTTP requests and returning responses as JSON or XML data.
		 	 
		 	 
		 	 
	-->In Spring, an MVC Controller is a part of the Model-View-Controller (MVC) 
		design pattern, used to handle web requests in an organized way.
		
     -->Simple Definition:
		Controller: It acts like a manager in a company who listens to client
		 			requests and decides what to do with them.
		 			
		In Spring MVC, the controller:
		1)Takes user input (web requests).
		2)Processes it (calls services or retrieves data).
		3)Sends back a view (like an HTML page) or data.
		
		
		
		@RequestMapping:-
		@RequestMapping is an annotation in Spring Framework
		 used to map HTTP requests to specific controller methods
		  or classes, enabling the creation of web applications by 
		  connecting URLs to functionality.


 */
@RestController
@RequestMapping("Count")
public class Controller {

	
	@RequestMapping("Name")
	public String GetName()
	{
		System.out.println("My Name is RajaGopal");
		return "RajaGopal";
	}
	
	
	@RequestMapping("getid")
	public int GetId() 
	{
		System.out.println("Id is = 101");
		return 101;
	}
	
	@RequestMapping("Salary")
	public double Getsal() 
	{
		System.out.println("Sal is =101.11");
		return 101.11;
	}
	
	@GetMapping("mstatus")
	public boolean mstatus()
	{
		System.out.println("not Married");
		return false;
	}
}
