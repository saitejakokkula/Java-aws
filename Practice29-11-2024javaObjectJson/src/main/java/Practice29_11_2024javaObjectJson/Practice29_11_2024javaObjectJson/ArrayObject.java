package Practice29_11_2024javaObjectJson.Practice29_11_2024javaObjectJson;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Arrobject")
public class ArrayObject {

	
	@RequestMapping("name")
	public Object[] names()
	{
		Object[] a = {12,"raja",34.56,true,'q'};
		
		System.out.println(a);
		return a;
	}
	/*URL :- http://localhost:8080/Arrobject/name
	 * 
	 * OutPut :- 
	  			[
    				12,
				    "raja",
				    34.56,
				    true,
				    "q"
				]
	 * 
	 */
	
	
	
	@RequestMapping("persons")
	public Object[] persons()
	{
		PersonPojo a = new PersonPojo();
		
		a.setPid(1);
		a.setPname("Birava");
		a.setPage(22);
		a.setPmob(56789l);
		a.setPloc("nrt");
		
		Object[] data = {"Birav",23,33,true,a};
		
		System.out.println(data);
		
		return data;
	}
	/*
	 * 
	 * URL :- http://localhost:8080/Arrobject/persons
	 * 
	 * 		OutPut :-
	 					
						[
							    "Birav",
							    23,
							    33,
							    true,
							    
							    	{
								        "pid": 1,
								        "pname": "Birava",
								        "page": 22,
								        "pmob": 56789,
								        "ploc": "nrt"
							    	}
						 ]
	 		
	 */
}
