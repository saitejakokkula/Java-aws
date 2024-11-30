package demoFristSpring.demoFristSpring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// creating a bean 
// taking request for User interface
@RequestMapping("empc")
public class empcontroller {
	
	@RequestMapping("name") //t is an annotation in Spring used to connect a URL (like /home) to a method in your code.
	public String name() {
		System.out.println("I am empcontroller class for name");
		return "Wellcome to Hyderabad..!";
	}
	@RequestMapping("getbyid")
	public Integer getbyid() {
		System.out.println("I am empcontroller class for getbyid");
		return 121 ;
	}
	@RequestMapping("getbysal")
	public Double getbysal() {
		System.out.println("I am empcontroller class for getbysal");
		return 56.36;
	}
	@RequestMapping("isprime")
	public Boolean isprime() {
		System.out.println(" I am empcontroller class for isprime");
		return true;
	}
	

}
