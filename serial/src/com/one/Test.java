package com.one;

import java.io.Serializable;

public class Test implements Serializable {
	
	
	private int eid;
	private String ename;
	private transient String edesg;
	private String eloc;
	
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
	public String getEdesg() {
		return edesg;
	}
	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}
	public String getEloc() {
		return eloc;
	}
	public void setEloc(String eloc) {
		this.eloc = eloc;
	}
	@Override
	public String toString() {
		return "Test [eid=" + eid + ", ename=" + ename + ", edesg=" + edesg + ", eloc=" + eloc + "]";
	}
	
	
	

}
