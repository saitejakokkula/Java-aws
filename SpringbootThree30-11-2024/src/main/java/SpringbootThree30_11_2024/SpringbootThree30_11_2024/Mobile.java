package SpringbootThree30_11_2024.SpringbootThree30_11_2024;

public class Mobile {

	
	private int mid;
	private long mnum;
	private String msim;
	
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public long getMnum() {
		return mnum;
	}
	public void setMnum(long mnum) {
		this.mnum = mnum;
	}
	public String getMsim() {
		return msim;
	}
	public void setMsim(String msim) {
		this.msim = msim;
	}
	
	
	@Override
	public String toString() {
		return "Mobile [mid=" + mid + ", mnum=" + mnum + ", msim=" + msim + "]";
	}
	
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(int mid, long mnum, String msim) {
		super();
		this.mid = mid;
		this.mnum = mnum;
		this.msim = msim;
	}
	
	
	
	
	
}
