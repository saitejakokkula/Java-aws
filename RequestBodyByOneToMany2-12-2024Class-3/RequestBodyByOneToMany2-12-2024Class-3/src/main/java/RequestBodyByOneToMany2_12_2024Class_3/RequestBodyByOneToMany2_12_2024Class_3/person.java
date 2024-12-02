package RequestBodyByOneToMany2_12_2024Class_3.RequestBodyByOneToMany2_12_2024Class_3;

import java.util.List;

public class person {

	
	private int pid;
	private String pname;
	private int page;
	private Passport pass;
	private List<mobile> pmob;
	private List<cource> pcou;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Passport getPass() {
		return pass;
	}
	public void setPass(Passport pass) {
		this.pass = pass;
	}
	public List<mobile> getPmob() {
		return pmob;
	}
	public void setPmob(List<mobile> pmob) {
		this.pmob = pmob;
	}
	public List<cource> getPcou() {
		return pcou;
	}
	public void setPcou(List<cource> pcou) {
		this.pcou = pcou;
	}
	
	
	@Override
	public String toString() {
		return "person [pid=" + pid + ", pname=" + pname + ", page=" + page + ", pass=" + pass + ", pmob=" + pmob
				+ ", pcou=" + pcou + "]";
	}
	
	
	public person(int pid, String pname, int page, Passport pass, List<mobile> pmob, List<cource> pcou) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.pass = pass;
		this.pmob = pmob;
		this.pcou = pcou;
	}
	
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
