package com.cisco;

public class employeepojo {
	
	private int sid;
	private String sname;
	private int sages;
	private String scourse;
	
	public employeepojo(int sid, String sname, int sages, String scourse) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sages = sages;
		this.scourse = scourse;
	}
	public employeepojo() {
		super();
	}
	@Override
	public String toString() {
		return "employeepojo [sid=" + sid + ", sname=" + sname + ", sages=" + sages + ", scourse=" + scourse + "]";
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSages() {
		return sages;
	}
	public void setSages(int sages) {
		this.sages = sages;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	
	
	
	

}
