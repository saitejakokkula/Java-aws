package com.one;

public class B implements A {

	@Override
	public void m1() {
		System.out.println("HI");
		
	}

	@Override
	public void m2() {
		System.out.println("HELLO");
		
	}
	public static void main(String[] args) {
		
		B b = new B();
		b.m1();
		b.m2();
		
	}

}
