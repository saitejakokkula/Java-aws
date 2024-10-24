package com.cicso;

public class dept implements Cloneable{
	

	private int did;
	private String dname;

	// Constructor
	public dept(int did, String dname) {
		this.did = did;
		this.dname = dname;
	}

	// Getter and Setter methods
	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	// Clone method
	@Override
	public dept clone() {
		dept dep = null;
		try {
			dep = (dept) super.clone(); // Shallow clone
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return dep;
	}

	// toString method
	@Override
	public String toString() {
		return "dept [did=" + did + ", dname=" + dname + "]";
	}

}