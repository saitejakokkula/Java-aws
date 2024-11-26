package com.UpdateandSelect;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller
{
	@Autowired
	private Service si;
	
		public PersonPojo save(PersonPojo poj)
		{
			
			System.out.println("This is Controller Class");
			return  si.save(poj);
		}
		
		
		public void update(int pid,int pagee,String ploc)
		{
			System.out.println("This Controller Class");
			si.update(pid, pagee, ploc);
			
		}
		
		
		public void delete(int pid)
		{
			System.out.println("This Controller Class");
			si.delete(pid);
		}
		
		public PersonPojo onedata(int pid)
		{
			System.out.println("This Controller Class");
			
			return si.onedata(pid);
		}
		
		public String pname(int pid)
		{
			System.out.println("This Controller Class");
			 return si.pname(pid);
		}
		
		
		
		public List<PersonPojo> alldata()
		{
			System.out.println("This Controller Class");
			return si.alldata();
		}
		
		
		public List<PersonPojo> alldata1()
		{
			return si.alldata1();
		}
		
		
		public List<Map<String, Object>> allpname()
		{
			return si.allpname();
		}
		
		public List<Map<String, Object>> MultiPnamePage()
		{
			return si.MultiPnamePage();
		}
		
		public List<Map<String, Object>> MulticoluOneRow(int pid)
		{
			return si.MulticoluOneRow( pid);
		}

}
