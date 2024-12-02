package RequestBodyByOneToMany2_12_2024Class_3.RequestBodyByOneToMany2_12_2024Class_3;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class personCountroller {

	/*
	 * http://localhost:8080/save
	 */
	
	/*
	 * {
	 * 
			"pid":1,
			"pname":"Birava",
			"page":23,

			"pass" : {"pid":101,"pnum": "DSAFD344","pexpy":2014 },

			"pmob":
			 [
			 		{"mid":1001,"msim":"bsnl","mnum":12345},  
			 		
			 		{"mid":1002,"msim":"Artiel","mnum":678910}, 
			 		
			 	   {"mid":1003,"msim":"jio","mnum":1112131415}
			 	   
		 	 ],

			"pcou": 
					[
						{"cid":10001,"cname":"java","cfee":567.89},
						
						{"cid":10002,"cname":"DevOps","cfee":678.89}, 
						 
					  {"cid":10003,"cname":"Python","cfee":789.89}
				]

}
	 */
	@RequestMapping("save")
	public person save(@RequestBody person poj)
	{
		System.out.println("This is Person="+poj);
		
		return poj;
	}
}
