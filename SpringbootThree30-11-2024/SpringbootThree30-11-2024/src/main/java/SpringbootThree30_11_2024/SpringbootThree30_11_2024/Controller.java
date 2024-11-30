package SpringbootThree30_11_2024.SpringbootThree30_11_2024;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	
	@RequestMapping("person")
	public Personpojo person()
	{
		//One to One //
		
		Personpojo p = new Personpojo();
		p.setPid(1);
		p.setPname("rajaGopal");
		p.setPage(22);
		
		System.out.println(p);
		return p;
	}
	
	
	@RequestMapping("passport")
	public Personpojo PersonPassport()
	{
		//One To Many //
		
		Personpojo p = new Personpojo();
		
		p.setPid(1);
		p.setPname("RajaGopal");
		p.setPage(22);
		
		p.setPass(new Passport(101, "123werd", 2040));
		
		System.out.println(p);
		
		return p;
		
	}
	
	@RequestMapping("mobile")
	public Personpojo Personmobile() 
	{
		//One To Many //
		
		Personpojo p = new Personpojo();
		
		p.setPid(1);
		p.setPname("Devaa");
		p.setPage(22);
		
		p.setPass(new Passport(101, "RWSX123", 2024));
		
		
		
		List<Mobile> mob = new ArrayList<>();
		
		mob.add(new Mobile(11, 12345l, "Artiel"));
		
		mob.add(new Mobile(12, 98765, "Bsnl"));
		
		mob.add(new Mobile(13, 96543, "jio"));
		
		p.setMobi(mob);
		
		System.out.println(p);
		
		return p;
	}
	
	@RequestMapping("cource")
	public Personpojo personcource() 
	{
		
		Personpojo  p = new Personpojo();
		
		p.setPid(101);
		p.setPname("Bhirava");
		p.setPage(24);
		
		
		p.setPass(new Passport(1001, "SDC123", 2024));
		
		List<Mobile> mob = new ArrayList();
		
		mob.add(new Mobile(121, 34567l, "Artiel"));
		mob.add(new Mobile(122, 56789l, "bsnl"));
		mob.add(new Mobile(123, 98765l, "vi"));
		
		p.setMobi(mob);
		
		
		List<cource>  cou = new ArrayList<>();
		
		cou.add(new cource(201, "java", 45600.00));
		cou.add(new cource(202, "Devops", 6780.00));
		cou.add(new cource(203, "python", 2560.00));
		
		p.setCou(cou);
		
		System.out.println(p);
		
		return p;
	}
	
}
