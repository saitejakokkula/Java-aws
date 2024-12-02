package RequestBodydatainBody2_12_2024.Class_2.RequestBodydatainBody2_12_2024.Class_2;

public class EmployePojo {

	
	private int eid;
	private String ename;
	private int eage;
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
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public String getEloc() {
		return eloc;
	}
	public void setEloc(String eloc) {
		this.eloc = eloc;
	}
	
	
	@Override
	public String toString() {
		return "EmployePojo [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eloc=" + eloc + "]";
	}
	
	public EmployePojo(int eid, String ename, int eage, String eloc) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.eloc = eloc;
	}
	
	
	public EmployePojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
