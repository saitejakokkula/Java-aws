package com.ByUsingjdbcOperationsClass1;

public class StudentPojo
{
	
	
	
	private int sid;
	private String sname;
	private int sage;
	private String sloc;
	
	
	
	public int getSid()
	{
		return sid;
	}
	public void setSid(int sid)
	{
		this.sid = sid;
	}
	public String getSname()
	{
		return sname;
	}
	public void setSname(String sname)
	{
		this.sname = sname;
	}
	public int getSage()
	{
		return sage;
	}
	public void setSage(int sage)
	{
		this.sage = sage;
	}
	public String getSloc()
	{
		return sloc;
	}
	public void setSloc(String sloc)
	{
		this.sloc = sloc;
	}
	
	
	
	@Override
	public String toString()
	{
		return "sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", sloc=" + sloc ;
	}
	
	
	
	public StudentPojo(int sid, String sname, int sage, String sloc)
	{
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.sloc = sloc;
	}
	
	
	public StudentPojo()
	{
		super();
	}
	
	
	
	
	
	
	
	
	

}