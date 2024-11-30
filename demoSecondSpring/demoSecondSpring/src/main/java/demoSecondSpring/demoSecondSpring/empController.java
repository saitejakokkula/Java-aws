package demoSecondSpring.demoSecondSpring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("empc")
public class empController {
	
	//http://localhost:8080/empc/getById?id=1&name=madhavi&sal=85.36&loc=Hyderabad
	@RequestMapping("getById")
	public void getById(@RequestParam("id") Integer id,
			@RequestParam("name") String name,
			@RequestParam("sal") Double sal,
			@RequestParam("loc") String loc) {
		
		System.out.println("I am in Id:  " + id);
		System.out.println("I am in Name: " + name);
		System.out.println("I am in Sal: " + sal);
		System.out.println("I am in loc: " + loc);
		
	}
	//http://localhost:8080/empc/alldata?Pid=1&pname=sai&page=25&ploc=Hyderabad
	@RequestMapping("alldata")
	public Personpojo getalldata(@RequestParam("pid") Integer pid, 
			@RequestParam("pname") String pname,
			@RequestParam("page") Integer page,
			@RequestParam("ploc") String ploc) {
		Personpojo p = new Personpojo();
		p.setPid(pid);
		p.setPname(pname);
		p.setPage(page);
		p.setPloc(ploc);
		
			return p;
	}
	//http://localhost:8080/empc/getname?name=akshu
	@RequestMapping("getname")
	public String getname(@RequestParam("name") String name) {
		
		System.out.println("I am in EmpController class:"+ name);
		
		return name;
		
	}
	
}
