package com.cicso;

public class emp implements Cloneable {
	
	private int eid;
	private String ename;
	private double esal;
	private String eloc;
	private dept dep;

	// Constructor
	public emp(int eid, String ename, double esal, String eloc, dept dep) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.eloc = eloc;
		this.dep = dep; // Pass dept in constructor
	}
	
	// Getter and Setter for dept
	public dept getDep() {
		return dep;
	}
	
	public void setDep(dept dep) {
		this.dep = dep;
	}

	// Setters that return a new emp object
	public emp setEid(int eid) {
		return new emp(eid, this.ename, this.esal, this.eloc, this.dep);
	}

	public emp setEname(String ename) {
		emp f = new emp(this.eid, ename, this.esal, this.eloc, this.dep);
		return f;
	}

	public emp setEsal(double esal) {
		return new emp(this.eid, this.ename, esal, this.eloc, this.dep);
	}

	public emp setEloc(String eloc) {
		return new emp(this.eid, this.ename, this.esal, eloc, this.dep);
	}

	// Getter methods
	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public double getEsal() {
		return esal;
	}

	public String getEloc() {
		return eloc;
	}

	// Clone method
	@Override
	public emp clone() {
		emp empClone = null;
		try {
			empClone = (emp) super.clone(); // Shallow clone

			// Deep clone the dept object
			dept clonedDept = this.dep.clone();
			empClone.setDep(clonedDept);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return empClone;
	}

	// toString method
	@Override
	public String toString() {
		return "emp [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", eloc=" + eloc + ", dep=" + dep + "]";
	}


}
