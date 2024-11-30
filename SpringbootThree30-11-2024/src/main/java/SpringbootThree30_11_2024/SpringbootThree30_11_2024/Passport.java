package SpringbootThree30_11_2024.SpringbootThree30_11_2024;

public class Passport {

	
	private int pid;
	private String pnum;
	private int pexp;
	
	
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
	public int getPexp() {
		return pexp;
	}
	public void setPexp(int pexp) {
		this.pexp = pexp;
	}
	
	
	@Override
	public String toString() {
		return "Passport [pid=" + pid + ", pnum=" + pnum + ", pexp=" + pexp + "]";
	}
	
	
	public Passport(int pid, String pnum, int pexp) {
		super();
		this.pid = pid;
		this.pnum = pnum;
		this.pexp = pexp;
	}
	
	
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
}
