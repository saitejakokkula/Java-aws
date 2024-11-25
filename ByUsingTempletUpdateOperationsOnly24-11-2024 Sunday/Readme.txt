Steps To Connect :-
1)Connect to the Connection Object.
2)handling the Exception
3)PrepareStatement---(quary) values(1,Raja,78.80,se).
4)Set Perameter values.
5)Execute Update.
Connection Closeing.


jtemp.update("insert into emp "(?,?,?,?)",1,"Raja11',567.78,"se").
(insert update delete Operations Can be Performed )


-------------------------------------------------------------------


Steps To Connect :-
1)Connection
2)Handling the Exception 
3)Prepare Satement Object we have to provide Query.
4)SetPerameters
5)Execute Query---Result Set--Data Mappling with String

6)Connection Autimaticaly Close Templet is handle the final Block code.


String name = QueryForObject(select ename from springjdbc.Personpojo where pid        
               = ? ,String.class,pid);

Select * 

1)One row Operation with All columns.

     PersonPojo pp = jtemp.queryForObject("select * from springjdbc.personpojo 
				where pid = ?", new BeanPropertyRowMapper<PersonPojo>				                             (PersonPojo.class),pid);
	System.out.println(pp);
		
			
Quary :- Select*from employe where eid =1; ---1 siva 65465.809 se.

2)One row Operation with Single Column

queryForObject
 
Quary :-Select ename from employe where eid =1; ----siva ---string
Quary :- Select max(esal) from employe --Double.
Quary :- Select min(esal) from employe --Double.
Quary :- Select count(*) from employe --Long.
Quary :- Select sum(esal) from employe --Double.

--------------------------------------------------------------------------------------------
3)Multiple rows with all columns ----1 Raja 67.788 se,  2 Devaa 56.78 dev.

Quary(select * from jdbcspring.personpojo, new bean row mapper<PersonPojo>PersonPojo.Class);
Quary :- Select * from employe;


4)Multiple rows with Single Columns---

Quary :-Select ename from employe;       ---siva---Ram---

5)multiple rows with all Columns 

Quary :- Select ename,Esal from employee;  ---Raja 678.89---Ram 890.09---

6)One row with multiple Columns 

Quary :- Select ename,esal from employe where eid =1; -----Siva  --678.89----


----------------------------------------------------------------------------


jtemp.update--Insert,Update,Delete.
jtemp.QuaryForObject ---(one row or One Column in a row or a Complete row ).
jtemp.Quary("Select * from employe",new OurRowmpper());

--> Thin this is no need employe Class or pojo class for this Quary

List<Map<String,Object>> data = jtemp.Queryforlist();


-------------------------------------------------------------
BeanPropertyRowMapper:--

--> new BeanPropertyRowMapper<employePojo>(employepojo.Class);
-->When resultset data column names and employeepojo properName same.


RowMapper ---Interface :-

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










