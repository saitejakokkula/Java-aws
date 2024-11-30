package PracticeThe30_11_2024jsonRequest.PracticeThe30_11_2024jsonRequest;

public class PersonPojo {

	
	private int pid;
	private String pname;
	private int age;
	private long pmob;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPmob() {
		return pmob;
	}
	public void setPmob(long pmob) {
		this.pmob = pmob;
	}
	public String getPloc() {
		return ploc;
	}
	public void setPloc(String ploc) {
		this.ploc = ploc;
	}
	
	
	@Override
	public String toString() {
		return "PersonPojo [pid=" + pid + ", pname=" + pname + ", age=" + age + ", pmob=" + pmob + ", ploc=" + ploc
				+ "]";
	}
	
	
	public PersonPojo(int pid, String pname, int age, long pmob, String ploc) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.age = age;
		this.pmob = pmob;
		this.ploc = ploc;
	}
	
	
	public PersonPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
