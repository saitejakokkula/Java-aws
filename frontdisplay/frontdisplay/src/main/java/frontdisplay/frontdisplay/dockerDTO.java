package frontdisplay.frontdisplay;




public class dockerDTO {

	
	private int did;
	private String dname;
	private double dfee;
	private String dspec;
	private String  dapointment;
	private String dstudy;
	private int exp;
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public double getDfee() {
		return dfee;
	}
	public void setDfee(double dfee) {
		this.dfee = dfee;
	}
	public String getDspec() {
		return dspec;
	}
	public void setDspec(String dspec) {
		this.dspec = dspec;
	}
	public String getDapointment() {
		return dapointment;
	}
	public void setDapointment(String dapointment) {
		this.dapointment = dapointment;
	}
	public String getDstudy() {
		return dstudy;
	}
	public void setDstudy(String dstudy) {
		this.dstudy = dstudy;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "dockerDTO [did=" + did + ", dname=" + dname + ", dfee=" + dfee + ", dspec=" + dspec + ", dapointment="
				+ dapointment + ", dstudy=" + dstudy + ", exp=" + exp + "]";
	}
	
	
}
