package demoFristSpring.demoFristSpring;

public class passportpojo {
	
	private int passportid;
	private long passportNumber;
	private int passportExp;
	
	public passportpojo() {
		super();
	}
	public passportpojo(int passportid, long passportNumber, int passportExp) {
		super();
		this.passportid = passportid;
		this.passportNumber = passportNumber;
		this.passportExp = passportExp;
	}
	@Override
	public String toString() {
		return "passportpojo [passportid=" + passportid + ", passportNumber=" + passportNumber + ", passportExp="
				+ passportExp + "]";
	}
	public int getPassportid() {
		return passportid;
	}
	public void setPassportid(int passportid) {
		this.passportid = passportid;
	}
	public long getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(long passportNumber) {
		this.passportNumber = passportNumber;
	}
	public int getPassportExp() {
		return passportExp;
	}
	public void setPassportExp(int passportExp) {
		this.passportExp = passportExp;
	}
	
	

}
