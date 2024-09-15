package com.one;

public class Test3 {
	
	private Integer did;
	private String dname;
	private String dloc;
	public Test3(Integer did, String dname, String dloc) {
		super();
		this.did = did;
		this.dname = dname;
		this.dloc = dloc;
	}
	@Override
	public String toString() {
		return "Test3 [did=" + did + ", dname=" + dname + ", dloc=" + dloc + "]";
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	
	

}
