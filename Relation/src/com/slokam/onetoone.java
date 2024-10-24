package com.slokam;

public class onetoone {

	public static void main(String[] args) {


		person p = new person();
		p.setPid(1);
		p.setPname("rajakumar");
		p.setPage(24);
		
		passport t = new passport();
		t.setPassid(123);
		t.setPassnumid("L23D");
		t.setPassexpdate(2050);
		
		p.setPort(t);
		
		System.out.println(p.getPid()+"----"+p.getPname()+"----"+p.getPage());

	}

}
