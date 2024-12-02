package RequestBodyByOneToMany2_12_2024Class_3.RequestBodyByOneToMany2_12_2024Class_3;

public class mobile {

	public int mid;
	public String msim;
	public long mnum;
	
	
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
	public long getMnum() {
		return mnum;
	}
	public void setMnum(long mnum) {
		this.mnum = mnum;
	}
	
	
	@Override
	public String toString() {
		return "mobile [mid=" + mid + ", msim=" + msim + ", mnum=" + mnum + "]";
	}
	
	public mobile(int mid, String msim, long mnum) {
		super();
		this.mid = mid;
		this.msim = msim;
		this.mnum = mnum;
	}
	
	
	public mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
