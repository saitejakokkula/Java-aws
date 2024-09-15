package com.overriding;

public class teju extends slokams{
	@Override
	public void m3() {
		System.out.println("method m3");
	}


	public static void main(String[] args) {
		
		slokams s = new slokams();
		s.m1();
		s.m2();
		s.m3();
	}

}
