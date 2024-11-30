package Practice29_11_2024javaObjectJson.Practice29_11_2024javaObjectJson;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Personcount")
public class PersonController {

	
	@RequestMapping("personn")
	public PersonPojo person()
	{
		PersonPojo p = new PersonPojo();
		p.setPid(1);
		p.setPname("Birava");
		p.setPage(23);
		p.setPmob(455666l);
		p.setPloc("hydrabad");
	
		System.out.println(p);
	
		return p;
	}
	
	/*URL :- http://localhost:8080/Personcount/personn
	 * 
	 * 	{
		    "pid": 1,
		    "pname": "Birava",
		    "page": 23,
		    "pmob": 455666,
		    "ploc": "hydrabad"
		}
	 * 
	 */
	
	
	@RequestMapping("Arrperson")
	public PersonPojo[]  perso()
	{
		PersonPojo p = new PersonPojo(1, "Birava", 45, 5678l, "hyd");
		PersonPojo p1 = new PersonPojo(2, "Birava", 45, 5678l, "sed");
		
		PersonPojo[] data = {p,p1};
		
		System.out.println(data);
		return data;	
	}
	
	/*		URL :- http://localhost:8080/Personcount/Arrperson
	 * 
	 * 
	 * 		OutPut :-
	 * 			
	 * 			[
				    {
				        "pid": 1,
				        "pname": "Birava",
				        "page": 45,
				        "pmob": 5678,
				        "ploc": "hyd"
				    },
				    
				    {
				        "pid": 2,
				        "pname": "Birava",
				        "page": 45,
				        "pmob": 5678,
				        "ploc": "sed"
				    }
				]
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
