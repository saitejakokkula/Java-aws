package com.slokam;

import java.util.List;

public class person {
	
	private int pid;
	private String pname;
	private int page;
	private passport port;
	private List<mobile> mob;
	private List<course> cou;
	
	public List<course> getCou() {
		return cou;
	}
	public void setCou(List<course> cou) {
		this.cou = cou;
	}
	public List<mobile> getMob() {
		return mob;
	}
	public void setMob(List<mobile> mob) {
		this.mob = mob;
	}
	public passport getPort() {
		return port;
	}
	public void setPort(passport port) {
		this.port = port;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	

}
