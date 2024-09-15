package com.one;

import java.util.Objects;

public class Test1 {

	private Integer eid;
	private String ename;
	private Double esal;
	
	public Test1(Integer eid, String ename, Double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Test1 [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(eid, ename, esal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test1 other = (Test1) obj;
		return Objects.equals(eid, other.eid) && Objects.equals(ename, other.ename) && Objects.equals(esal, other.esal);
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getEsal() {
		return esal;
	}

	public void setEsal(Double esal) {
		this.esal = esal;
	}
	
	
	

}
