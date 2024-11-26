package com.slokam;

public class Test {

	public static void main(String[] args) {
		
		deveploer d = new deveploer();
		teamlead t = new teamlead(d);
		
		managar m = new managar(t);
		m.workdone();

	}

}
