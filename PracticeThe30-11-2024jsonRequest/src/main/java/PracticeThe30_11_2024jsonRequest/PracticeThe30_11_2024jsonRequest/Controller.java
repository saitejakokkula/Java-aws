package PracticeThe30_11_2024jsonRequest.PracticeThe30_11_2024jsonRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


	/*
	 * Save :-
	 * prototype //Mechine //Tomcat Server port number //method // ? =& requestpem
	 * http://localhost:8080/save?eid=101&ename=Bairava&esal=34.45&edesg=dev
	 */
	@RequestMapping("save")
	public void save
	(
			@RequestParam("eid") Integer eid,
			@RequestParam("ename") String ename,
			@RequestParam("esal")  double esal,
			@RequestParam("edesg") String edesg
		
	)
	{
		System.out.println("This is save="+eid);
		System.out.println("This is save="+ename);
		System.out.println("This is save="+esal);
		System.out.println("This is save="+esal);
		
	}
	
	
	
	/*
	 * Update :-
	 * http://localhost:8080/update?eid=121&ename=Birava&esal=89.90
	 */
	@RequestMapping("update")
	public void update
	(
			
			@RequestParam("eid") Integer eid,
			@RequestParam("ename") String ename,
			@RequestParam("esal")  Double esal	
	)
	{
		
		System.out.println("This is Update="+eid);
		System.out.println("This is Update="+ename);
		System.out.println("This is Update="+esal);
		
	}
	
	/*
	 * Delete Operation :-
	 * http://localhost:8080/delete?eid=122
	 * 
	 */
	@RequestMapping("delete")
	public void delete
	(
			@RequestParam("eid") Integer eid
			
	)
	{
		System.out.println("this is Delete Operation="+eid);
	}
	
	
	
	/*
	 * GetById :-
	 * http://localhost:8080/getbyid?pid=1
	 */
	
		@RequestMapping("getbyid")
		public PersonPojo getbyid(int pid)
		{
			
			PersonPojo p = new PersonPojo();
			
			p.setPid(1);
			p.setPname("Birava");
			p.setAge(24);
			p.setPmob(678888);
			p.setPloc("hyd");
			
			System.out.println(p);
			
			return p;	
		}
	
		/*GetAll :-
		 * http://localhost:8080/getAll
		 */
		@RequestMapping("getAll")
		public PersonPojo GetAll()
		{
				PersonPojo p = new PersonPojo();
			
				p.setPid(1);
				p.setPname("Birava");
				p.setAge(24);
				p.setPmob(678888);
				p.setPloc("hyd");
			
				System.out.println(p);
			
			return p;	
		}
	
	
}
