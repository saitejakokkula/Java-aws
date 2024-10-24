package com.slokam;

import java.util.ArrayList;
import java.util.List;

public class onetomany {

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
		
		List<mobile> m = new ArrayList();
		m.add(new mobile(1, "bsnl", 853624L));
		m.add(new mobile(2, "jio", 759426L));
		m.add(new mobile(3, "airtel", 5632478L));
		
		p.setMob(m);
		System.out.println("--------one to one-------------");
		System.out.println(p.getPid()+"----"+p.getPname()+"----"+p.getPage());
		System.out.println("------------one to many--------------");
		List<mobile> ls = p.getMob();
		for(mobile b : ls) {
			System.out.println(b.getMid()+"----"+b.getMsim()+"----"+b.getMnum());
		}
		

	}

}
