package com.pojo;

public class product {
	
	private int pid;
	private String pname;
	private double pprice;
	private double pgst;
	private String pvendor;
	private String pcountry;
	private String ptype;


	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpname() {
		return pname;
	}

	public void setpname(String ename) {
		this.pname = ename;
	}

	public double getPprice() {
		return pprice;
	}

	public void setPprice(double pprice) {
		this.pprice = pprice;
	}

	public double getPgst() {
		return pgst;
	}

	public void setPgst(double pgst) {
		this.pgst = pgst;
	}

	public String getPvendor() {
		return pvendor;
	}

	public void setPvendor(String pvendor) {
		this.pvendor = pvendor;
	}

	public String getPcountry() {
		return pcountry;
	}

	public void setPcountry(String pcountry) {
		this.pcountry = pcountry;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	@Override
	public String toString() {
		return "product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pgst=" + pgst + ", pvendor="
				+ pvendor + ", pcountry=" + pcountry + ", ptype=" + ptype + "]";
	}
	
	

}
