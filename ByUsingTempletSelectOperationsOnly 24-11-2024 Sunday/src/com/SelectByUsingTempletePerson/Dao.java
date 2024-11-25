package com.SelectByUsingTempletePerson;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Dao
{
	
	@Autowired
	private JdbcTemplate jtemp;
	
	
	
	//One row Operation with Single Column
		public void OnerowOneColuman(int pid)
		{
			System.out.println("This is Deo Class");
			
		String   column =	jtemp.queryForObject("select pname from springjdbc1.personpojo where pid = ?", String.class,pid);
		
		
		System.out.println(column);
			
		}
		
		
		//One complete row Operation with multiple  Column
		public void OneEmployedata(int pid)
		{
			System.out.println("This is Dao Class");
			
			PersonPojo pp	= jtemp.queryForObject("select * from springjdbc1.personpojo where pid = ?", new BeanPropertyRowMapper<PersonPojo>(PersonPojo.class),pid);
			
			System.out.println(pp);
		}
		
		
		//Maximum sal of employe
		public void Maxesal()
		{
			System.out.println("This is Dao Class");
			
			int mesal	=	jtemp.queryForObject("select max(pagee) from springjdbc1.personpojo", Integer.class);
		
			System.out.println(mesal);
		}
		
		
		public void Minesal()
		{
			System.out.println("This is Dao Class");
			
			int meage	=	jtemp.queryForObject("select min(pagee) from springjdbc1.personpojo", Integer.class);
		
			System.out.println(meage);
		}
		
		
		//Count of Persons //
		public void countperson()
		{
			System.out.println("This is Dao Class");
			long count	=	jtemp.queryForObject("select count(*) from springjdbc1.personpojo", Long.class);
			
			System.out.println(count);
		}
		
		
		//Sum of Age //
		public void sumage()
		{
			
			System.out.println("This is Dao Class");
			
			int sum	=	jtemp.queryForObject("select sum(pagee) from springjdbc1.personpojo", Integer.class);
	
		System.out.println(sum);
		
		}
		//----------------------------------------------------------------//
		
	//	By Using Query Templet
		//Multiple rows with multiple columns //
		public void allempdata()
		{
			System.out.println("This is Controller Class");
					
			List<PersonPojo> data	=	jtemp.query("select * from springjdbc1.personpojo ", new BeanPropertyRowMapper<PersonPojo>(PersonPojo.class));
		
				Iterator<PersonPojo>		daaa	=	data.iterator();
			
			
			while(daaa.hasNext())
			{
				System.out.println(daaa.next());
			}
			
		}
		/*
		 * If Column propertys are not same to person properties second way is there 
		 * RowMapper ---Interface :-

-->When resultset data column names and employepojo Propername or not same then
	1)we create Ourown RowMapper class.

--> 2)OurOwn Rowmapper class should implements Rowmapper<employePojo>  -i nterface
---3)RowMapper Consistes of Method ---MapRow(Resultset rs,int args)  
		Return type is every type is Changing.

	
	@Override
	public StudentPojo mapRow(ResultSet rs, int arg1) throws SQLException
	{
		StudentPojo std = new StudentPojo();
		
			std.setSid(rs.getInt("sid"));
			std.setSname(rs.getString("sname"));
			std.setSagee(rs.getInt("sage"));
			std.setSloc(rs.getString("sloc"));
			
		return std;
	}

		 */
		
		//multiple row maps with multiple columns are not matched //
		
		public void getallnocolumnmatch()
		{
			System.out.println("This is Dao Class");
			
		List<PersonPojo> pp=	jtemp.query("select * from springjdbc1.personpojo", new OurRowMapper());
	
		
			Iterator<PersonPojo>	data	=	pp.iterator();
			
			
			while(data.hasNext())
			{
				System.out.println(data.next());
			}
		
		}	
		
//-------------------------------------------------------------------------//
		
		//  By using queryforlist only //
		//Multiple rows with single column //
		public void multirscolu()
		{
			System.out.println("This is Dao Class");
			
		List<Map<String, Object>>	data	= jtemp.queryForList("select pname from springjdbc1.personpojo");
		
			Iterator<Map<String, Object>>		daa		=	data.iterator();
			
							while(daa.hasNext()) 
							{
								System.out.println(daa.next());
							}
		
		}
		
		
		//Multiple rows with all columns  //
		//By Taking pname,page,phone number //
		
		public void pnameagenumber()
		{
			System.out.println("This is Controller Class");
			
			
			List<Map<String, Object>>  data=	jtemp.queryForList("select pname,pagee,pmob from springjdbc1.personpojo");
		
		
				Iterator<Map<String, Object>>	daaa	=	data.iterator();
				
				
				while(daaa.hasNext())
				{
					System.out.println(daaa.next());
				}
		
		
		
		}
		
		
		//By using name,age Where pid .//
		
		public void pnamepagenumber(int pid)
		{
			System.out.println("This is Dao Class");
			
	List<Map<String, Object>> data =	jtemp.queryForList("select  pname, pagee FROM springjdbc1.personpojo WHERE pid = ? ",pid);
			
	
	
				Iterator<Map<String, Object>>	daa			=	data.iterator();
			
				
				while(daa.hasNext())
				{
					System.out.println(daa.next());
				}
		}
		
		
		
		
		
		
		
		
		
		

}
