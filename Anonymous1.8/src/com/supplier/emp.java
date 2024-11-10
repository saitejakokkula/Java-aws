package com.supplier;

public class emp {
	
	private int eid;
	private String ename;
	private int eage;
	private String edegs;
	
	@Override
	public String toString() {
		return "emp [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", edegs=" + edegs + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public String getEdegs() {
		return edegs;
	}
	public void setEdegs(String edegs) {
		this.edegs = edegs;
	}
	
	

}
