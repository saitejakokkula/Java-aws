package Practice29_11_2024javaObjectJson.Practice29_11_2024javaObjectJson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("collection")
class CollectionController {

	/*URL :- http://localhost:8080/collection/listperson
	 * 
	 * OutPut :-
	 * 		
			 * 			
			 	[
				    {
				        "pid": 1,
				        "pname": "Birava",
				        "page": 27,
				        "pmob": 56789,
				        "ploc": "sap"
				    },
				    
				    {
				        "pid": 2,
				        "pname": "Birava",
				        "page": 23,
				        "pmob": 56788,
				        "ploc": "nrt"
				    },
				    
				    {
				        "pid": 3,
				        "pname": "Birava",
				        "page": 23,
				        "pmob": 56789,
				        "ploc": "gnt"
				    }
			]
	 * 
	 */
	@RequestMapping("listperson")
	public List<PersonPojo> listperson()
	{
		List<PersonPojo> data = new ArrayList<>();
		
		data.add(new PersonPojo(1, "Birava", 27, 56789, "sap"));
		data.add(new PersonPojo(2, "Birava", 23, 56788, "nrt"));
		data.add(new PersonPojo(3, "Birava", 23, 56789, "gnt"));
		
		System.out.println(data);
		
		return data;
	}
	
	
	/*URL :- http://localhost:8080/collection/setperson
	 * 
	 * 			[
					    {
					        "pid": 1,
					        "pname": "Birava",
					        "page": 23,
					        "pmob": 98765,
					        "ploc": "hyd"
					    },
					    
					    {
					        "pid": 2,
					        "pname": "Birava",
					        "page": 23,
					        "pmob": 98765,
					        "ploc": "hyd"
					    }
				]
	 * 
	 */
	@RequestMapping("setperson") 
	public Set<PersonPojo>  setperson()
	{
		Set<PersonPojo> data = new HashSet<>();
		
		data.add(new PersonPojo(1, "Birava", 23, 98765, "hyd"));
		data.add(new PersonPojo(2, "Birava", 23, 98765, "hyd"));
	
		System.out.println(data);
		
		return data;
		
	}
	
	
	
	
	/*
	 *  URL :- http://localhost:8080/collection/Mapper
	 *  
	 *  {
	 *  
		    "PersonPojo [pid=3, pname=Birava, page=29, pmob=98765, ploc=gnt]": 103,
		    "PersonPojo [pid=2, pname=Birava, page=28, pmob=98765, ploc=sap]": 102,
		    "PersonPojo [pid=1, pname=Birava, page=27, pmob=98765, ploc=nrt]": 101
		}
	 * 
	 */
	
	@RequestMapping("Mapper")
	public Map<PersonPojo, Integer> mapperson()
	{
		Map<PersonPojo, Integer> data = new HashMap<>();
		
		data.put(new PersonPojo(1, "Birava", 27, 98765, "nrt"), 101);
		
		data.put(new PersonPojo(2, "Birava", 28, 98765, "sap"), 102);
		
		data.put(new PersonPojo(3, "Birava", 29, 98765, "gnt"), 103);
		
		
		System.out.println(data);
		
		return data;	
	}
}
