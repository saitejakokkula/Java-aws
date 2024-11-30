package demoFristSpring.demoFristSpring;

public class Mobile {
	
	
	private int mid;
	private String msim;
	private long mnumber;
	
	public Mobile() {
		super();
	}
	public Mobile(int mid, String msim, long mnumber) {
		super();
		this.mid = mid;
		this.msim = msim;
		this.mnumber = mnumber;
	}
	@Override
	public String toString() {
		return "Mobile [mid=" + mid + ", msim=" + msim + ", mnumber=" + mnumber + "]";
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMsim() {
		return msim;
	}
	public void setMsim(String msim) {
		this.msim = msim;
	}
	public long getMnumber() {
		return mnumber;
	}
	public void setMnumber(long mnumber) {
		this.mnumber = mnumber;
	}
	
	

}
