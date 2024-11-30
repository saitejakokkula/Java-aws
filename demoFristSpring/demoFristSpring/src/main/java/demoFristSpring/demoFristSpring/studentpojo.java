package demoFristSpring.demoFristSpring;

import java.util.List;

public class studentpojo {
	
	private int sid;
	private String sname;
	private int sage;
	private Double smarks;
	private passportpojo pass;
	private List<Mobile> mob;
	private List<course> cou;
	
	public passportpojo getPass() {
		return pass;
	}
	public void setPass(passportpojo pass) {
		this.pass = pass;
	}
	public List<Mobile> getMob() {
		return mob;
	}
	public void setMob(List<Mobile> mob) {
		this.mob = mob;
	}
	public List<course> getCou() {
		return cou;
	}
	public void setCou(List<course> cou) {
		this.cou = cou;
	}
	@Override
	public String toString() {
		return "studentpojo [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", smarks=" + smarks + "]";
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
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public Double getSmarks() {
		return smarks;
	}
	public void setSmarks(Double smarks) {
		this.smarks = smarks;
	}
	
	
	

}
