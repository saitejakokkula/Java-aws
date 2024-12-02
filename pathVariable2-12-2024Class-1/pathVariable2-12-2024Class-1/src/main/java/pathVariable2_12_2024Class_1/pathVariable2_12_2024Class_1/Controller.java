package pathVariable2_12_2024Class_1.pathVariable2_12_2024Class_1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	/*
	 * 	it is using PathVariable by using labels 
	 */
	
	  //   URL : http:localhost:8080/save/101/Birava/29    
	
	@RequestMapping("save/{pid}/{pname}/{page}")
	public PersonPojo save
	(
		@PathVariable("pid")	int pid,
		@PathVariable("pname")	String pname,
		@PathVariable("page")	int page
	)
	
	{
		
		PersonPojo poj = new PersonPojo();
		
		poj.setPid(pid);
		poj.setPname(pname);
		poj.setPage(page);
		
		System.out.println(poj);
		return poj;
	}
	
	
	//----------------------------------------------//
	
	
	// URL :- http://localhost:8080/update/121/22   
	
	@RequestMapping("update/{pid}/{page}")
	public int update
	(
		@PathVariable("pid")	int pid,
		@PathVariable("page")   int  page
	)
	
	{
		System.out.println(pid);
		System.out.println(page);
		
		return pid;
	}
	
	
	//------------------------------------------------//
	
	
	//URL : http://localhost:8080/delete/120
	
	@RequestMapping("delete/{pid}")
	public int delete
	(
		@PathVariable("pid")	int pid
	)
	{
		
		System.out.println("The deleted id is ="+pid);
		return pid;
	}
	
	
	//-----------------------------------------------------//
	
	
	//URL : http://localhost:8080/getbyid/101
	
	@RequestMapping("getbyid/{pid}")
	public PersonPojo getbyid
	(
		@PathVariable("pid")	int pid
	)
	{
		
		PersonPojo p = new PersonPojo();
		p.setPage(pid);
		p.setPname("Birava");
		p.setPage(23);
		
		return p;
	}
	
	
	//----------------------------------------------------//
	
	
	
	// URL : http://localhost:8080/getAll
	@RequestMapping("getAll")
	public PersonPojo GetAll()
	{
		PersonPojo p = new PersonPojo();
		
		p.setPid(101);
		p.setPname("Birava");
		p.setPage(28);
		
		System.out.println(p);
		return p;
	}
	
	
}
