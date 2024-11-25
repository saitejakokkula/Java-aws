package com.UpdateByUsingTempletePerson;

public class PersonPojo
{
	
	private int pid;
	private String pname;
	private int pagee;
	private long pmob;
	private String ploc;
	
	
	public int getPid()
	{
		return pid;
	}
	public void setPid(int pid)
	{
		this.pid = pid;
	}
	public String getPname()
	{
		return pname;
	}
	public void setPname(String pname)
	{
		this.pname = pname;
	}
	public int getPagee()
	{
		return pagee;
	}
	public void setPagee(int pagee)
	{
		this.pagee = pagee;
	}
	public long getPmob()
	{
		return pmob;
	}
	public void setPmob(long pmob)
	{
		this.pmob = pmob;
	}
	public String getPloc()
	{
		return ploc;
	}
	public void setPloc(String ploc)
	{
		this.ploc = ploc;
	}
	
	
	@Override
	public String toString()
	{
		return "PersonPojo [pid=" + pid + ", pname=" + pname + ", pagee=" + pagee + ", pmob=" + pmob + ", ploc=" + ploc
				+ "]";
	}
	
	
	public PersonPojo(int pid, String pname, int pagee, long pmob, String ploc)
	{
		super();
		this.pid = pid;
		this.pname = pname;
		this.pagee = pagee;
		this.pmob = pmob;
		this.ploc = ploc;
	}
	
	
	public PersonPojo()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	

}
