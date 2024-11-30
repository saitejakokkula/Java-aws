package Practice29_11_2024javaObjectJson.Practice29_11_2024javaObjectJson;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("datatype")
public class datatypecontroller {

	
	
	@RequestMapping("name")
	public String name()
	{
		System.out.println("This is hydrabad");
		return "Hydrabad";
	}
	
	@RequestMapping("id")
	public int id() 
	{
		System.out.println("101");
		return 101;
	}
	
	@RequestMapping("sal")
	public double sal()
	{
		System.out.println("45.56");
		return 67.79;
	}
	
	@RequestMapping("mstatus")
	public boolean marr()
	{
		System.out.println("No");
		return true;
	}
}
