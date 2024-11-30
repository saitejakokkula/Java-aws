package SpringbootRequestPerameter30_11_2024.SpringbootRequestPerameter30_11_2024;

public class PersonPojo {

	
	private int pid;
	private String pname;
	private int page;
	private String ploc;
	
	
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
	public String getPloc() {
		return ploc;
	}
	public void setPloc(String ploc) {
		this.ploc = ploc;
	}
	
	
	public PersonPojo(int pid, String pname, int page, String ploc) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.ploc = ploc;
	}
	
	
	@Override
	public String toString() {
		return "PersonPojo [pid=" + pid + ", pname=" + pname + ", page=" + page + ", ploc=" + ploc + "]";
	}
	
	
	public PersonPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
