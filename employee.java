package DublicatedataInnumber13112024Class2;

public class employee
{
	
	
	private Integer eid;
	private String ename;
	private Double esal;
	private String edesg;
	private String eloc;
	
	
	
	public employee(Integer eid, String ename, Double esal, String edesg, String eloc)
	{
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edesg = edesg;
		this.eloc = eloc;
	}
	
	
	@Override
	public String toString()
	{
		return "eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edesg=" + edesg + ", eloc=" + eloc
				;
	}
	
	
	
	public Integer getEid()
	{
		return eid;
	}
	public void setEid(Integer eid)
	{
		this.eid = eid;
	}
	public String getEname()
	{
		return ename;
	}
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	public Double getEsal()
	{
		return esal;
	}
	public void setEsal(Double esal)
	{
		this.esal = esal;
	}
	public String getEdesg()
	{
		return edesg;
	}
	public void setEdesg(String edesg)
	{
		this.edesg = edesg;
	}
	public String getEloc()
	{
		return eloc;
	}
	public void setEloc(String eloc)
	{
		this.eloc = eloc;
	}
	
	
	
	

}
