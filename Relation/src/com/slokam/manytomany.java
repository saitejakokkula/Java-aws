package com.slokam;

import java.util.ArrayList;
import java.util.List;

public class manytomany {
	
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
		
		List<course> c = new ArrayList();
		c.add(new course(1, "java", 15000.00));
		c.add(new course(2, "aws", 15000.0));
		c.add(new course(3, "mysql", 10000.0));
		
		p.setCou(c);
		
		System.out.println("--------one to one-------------");
		System.out.println(p.getPid()+"----"+p.getPname()+"----"+p.getPage());
		System.out.println("------------one to many--------------");
		List<mobile> ls = p.getMob();
		for(mobile b : ls) {
			System.out.println(b.getMid()+"----"+b.getMsim()+"----"+b.getMnum());
		}
		System.out.println("-------many to many------------");
		List<course> lc = p.getCou();
		for(course a : lc) {
			System.out.println(a.getCid()+"----"+a.getCname()+"----"+a.getCfee());
		}
		
		
	}

}
