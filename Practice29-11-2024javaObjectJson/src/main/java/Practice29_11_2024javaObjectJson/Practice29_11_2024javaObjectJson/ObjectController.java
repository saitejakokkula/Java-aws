package Practice29_11_2024javaObjectJson.Practice29_11_2024javaObjectJson;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Objectcou")
public class ObjectController {
	
	
	/*
	 * URL :-http://localhost:8080/Objectcou/name
	 */
	@RequestMapping("name")
	public Object namme()
	{
		Object a = 12;
		System.out.println(a);
		return a;
	}
	
	
	
	
	
	/*
	 * URL :- http://localhost:8080/Objectcou/salary
	 * 
	 */
	@RequestMapping("salary")
	public Object salary()
	{
		Object a = 34.45;
		System.out.println(a);
		return a;
	}
	
	
	
	/*
	 * URL :- http://localhost:8080/Objectcou/Value
	 */
	@RequestMapping("Value")
	public Object value()
	{
		Object a = 12;
		System.out.println(a);
		return a;
	}
	
	/*
	 * URL :- http://localhost:8080/Objectcou/boole
	 */
	@RequestMapping("boole")
	public Object boolea()
	{
		Object a = true;
		
		System.out.println(a);
		return a;
	}
	
	/*
	 * URL :- http://localhost:8080/Objectcou/empdata
	 * 
	 * Output :- 
	 * 				{
	    				"pid": 101,
	    				"pname": "Birava",
						"page": 34,
	    				"pmob": 45555,
	    				"ploc": "hyd"
					}
	 */
	
	@RequestMapping("empdata")
	public Object empdata()
	{
		PersonPojo p = new PersonPojo();
		p.setPid(101);
		p.setPname("Birava");
		p.setPage(34);
		p.setPmob(45555);
		p.setPloc("hyd");
		
		Object a = p;
		System.out.println(a);
		return a;
	}

}
