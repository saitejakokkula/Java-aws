package RequestBodyByOneToMany2_12_2024Class_3.RequestBodyByOneToMany2_12_2024Class_3;

public class Passport {

	
	private int pid;
	private String pnum;
	private int pexpy;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public int getPexpy() {
		return pexpy;
	}
	public void setPexpy(int pexpy) {
		this.pexpy = pexpy;
	}
	
	
	@Override
	public String toString() {
		return "Passport [pid=" + pid + ", pnum=" + pnum + ", pexpy=" + pexpy + "]";
	}
	
	
	public Passport(int pid, String pnum, int pexpy) {
		super();
		this.pid = pid;
		this.pnum = pnum;
		this.pexpy = pexpy;
	}
	
	public Passport() {
		super();
	}
	
	
	
	
	
}
