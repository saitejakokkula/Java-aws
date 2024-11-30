package SpringbootRequestPerameter30_11_2024.SpringbootRequestPerameter30_11_2024;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@RequestMapping("save")
	public void save
	(
			@RequestParam("eid") Integer eid,
			@RequestParam("ename") String ename,
			@RequestParam("esal") Double esal,
			@RequestParam("edesg") String edesg
	)
	{
		
		System.out.println("The id is:-"+eid);
		System.out.println("The Name is :-"+ename);
		System.out.println("This is Esal :-"+esal);
		System.out.println("This is Edesg :-"+edesg);
		
	}
	
	
	@RequestMapping("update")
	public void update
	(
			@RequestParam("eid") Integer eid,
			@RequestParam("esal") Double esal,
			@RequestParam("edesg") String edesg
	)
	{
		
		System.out.println("Update data is:-"+eid);
		System.out.println("Update data is:-"+esal);
		System.out.println("Update data is:-"+edesg);
		
	}
	
	//http://localhost:8080/delete?eid=130//
	
	
	@RequestMapping("delete")
	public void delete
	(
			@RequestParam("eid") Integer eid
	)
	{
		System.out.println("The delete is="+eid);
		
	}
	
	//http://localhost:8080/getbyid?eid=121
	@RequestMapping("getbyid")
	public int GetByid(int eid)
	{
		System.out.println("The id is="+eid);
		return eid;
	}
	
	
	//http://localhost:8080/GetAll//
	@RequestMapping("GetAll")
	public PersonPojo GetAll()
	{
		PersonPojo p = new PersonPojo();
		p.setPid(101);
		p.setPname("Bairava");
		p.setPage(23);
		p.setPloc("hyd");
		
		System.out.println(p);
		
		return p;
	}

}
