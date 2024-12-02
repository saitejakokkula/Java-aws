package RequestBodyByOneToMany2_12_2024Class_3.RequestBodyByOneToMany2_12_2024Class_3;

public class cource {

	
	private int cid;
	private String cname;
	private double cfee;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getCfee() {
		return cfee;
	}
	public void setCfee(double cfee) {
		this.cfee = cfee;
	}
	
	
	@Override
	public String toString() {
		return "cource [cid=" + cid + ", cname=" + cname + ", cfee=" + cfee + "]";
	}
	
	
	public cource(int cid, String cname, double cfee) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfee = cfee;
	}
	
	
	public cource() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
