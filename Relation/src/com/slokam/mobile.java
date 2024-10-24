package com.slokam;

public class mobile {

	
	private int mid;
	private String msim;
	private long mnum;
	
	public mobile(int mid, String msim, long mnum) {
		super();
		this.mid = mid;
		this.msim = msim;
		this.mnum = mnum;
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
	public long getMnum() {
		return mnum;
	}
	public void setMnum(long mnum) {
		this.mnum = mnum;
	}
	
	
}
