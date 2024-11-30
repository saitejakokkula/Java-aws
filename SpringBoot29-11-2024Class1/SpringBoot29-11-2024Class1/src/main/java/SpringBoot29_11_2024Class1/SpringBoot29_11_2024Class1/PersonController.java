package SpringBoot29_11_2024Class1.SpringBoot29_11_2024Class1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("PCount")
public class PersonController {

	
	@RequestMapping("Pid")
	public PersonPojo GetAll() 
	{
		
		PersonPojo p =new PersonPojo();
		
		p.setPid(1);
		p.setPname("Rajagopal");
		p.setPage(27);
		p.setPmob(12345);
		p.setPloc("hyd");
		
		System.out.println(p);
		return p;
		
	}
}
