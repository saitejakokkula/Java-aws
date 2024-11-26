package com.UpdateandSelect;

public class PersonPojo
{

		
		
	private int pid;
	private String pname;
	private int pagee;
	private long pmobb;
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
	public long getPmobb()
	{
		return pmobb;
	}
	public void setPmobb(long pmobb)
	{
		this.pmobb = pmobb;
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
		return "PersonPojo [pid=" + pid + ", pname=" + pname + ", pagee=" + pagee + ", pmobb=" + pmobb + ", ploc="
				+ ploc + "]";
	}
	
	
	public PersonPojo(int pid, String pname, int pagee, long pmobb, String ploc)
	{
		super();
		this.pid = pid;
		this.pname = pname;
		this.pagee = pagee;
		this.pmobb = pmobb;
		this.ploc = ploc;
	}
	
	
	public PersonPojo()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
		
		
		
		
		
		
		
}
