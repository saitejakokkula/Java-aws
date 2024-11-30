package SpringbootThree30_11_2024.SpringbootThree30_11_2024;

import java.util.List;

public class Personpojo {

	
	private int pid;
	private String pname;
	private int page;
	
	
	private Passport pass;
	
	private List<Mobile> mobi;
	
	private List<cource>  cou;
	
	

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

	public List<Mobile> getMobi() {
		return mobi;
	}

	public void setMobi(List<Mobile> mobi) {
		this.mobi = mobi;
	}

	public List<cource> getCou() {
		return cou;
	}

	public void setCou(List<cource> cou) {
		this.cou = cou;
	}

	
	@Override
	public String toString() {
		return "Personpojo [pid=" + pid + ", pname=" + pname + ", page=" + page + ", pass=" + pass + ", mobi=" + mobi
				+ ", cou=" + cou + "]";
	}

	
	
	public Personpojo(int pid, String pname, int page, Passport pass, List<Mobile> mobi, List<cource> cou) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.pass = pass;
		this.mobi = mobi;
		this.cou = cou;
	}

	
	
	public Personpojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
}
