package RequestBodydatainBody2_12_2024.Class_2.RequestBodydatainBody2_12_2024.Class_2;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReqbodyController {

	//First it will come to upto request mapping in jsn format only
	//When ever it see @requestBody it will create an Object and it will
	//check the properties name both are same value it will give different 
	//the default values will be Execute .
	@RequestMapping("employe")
	public EmployePojo save(@RequestBody EmployePojo emp)
	{
		
		System.out.println("This is jsn format to Converted--="+emp);
		
		
		return emp;
	}
	
	
}
