package pathVariable2_12_2024Class_1.pathVariable2_12_2024Class_1;

public class PersonPojo {

	
	private int pid;
	private String pname;
	private int page;
	
	
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
	
	
	@Override
	public String toString() {
		return "PersonPojo [pid=" + pid + ", pname=" + pname + ", page=" + page + "]";
	}
	
	
	public PersonPojo(int pid, String pname, int page) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
	}
	
	
	public PersonPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
