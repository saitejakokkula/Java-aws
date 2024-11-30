package SpringFristProject.SpringFristProject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@GetMapping("name")
	public String getname() {
		
		System.out.println("I am in controller class");
		return "Wellcome to Hyderabad...!";
		
	}

}
