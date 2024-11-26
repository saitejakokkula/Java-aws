package com.cisco;

public class Test {

	public static void main(String[] args) {
		
		man m = new man();
		
		teamlead t = new teamlead();
		m.setT1(t);
		
		deveploer d = new deveploer();
		t.setDev1(d);
		
		m.workdone();
		

	}

}
