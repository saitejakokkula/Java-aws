package com.studentpojo;

public class student {
	
	private int sid;
	private String sname;
	private int sage;
	private double smarks;
	private String sloc;
	
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
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public double getSmarks() {
		return smarks;
	}
	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}
	public String getSloc() {
		return sloc;
	}
	public void setSloc(String sloc) {
		this.sloc = sloc;
	}
	
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", smarks=" + smarks + ", sloc=" + sloc
				+ "]";
	}
	

}
