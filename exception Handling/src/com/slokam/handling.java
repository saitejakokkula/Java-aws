package com.slokam;

public class handling {
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	public void m2() {
		System.out.println("m2 method");
		m1();
	}

	public static void main(String[] args) {
		
		System.out.println("main method");
		handling h = new handling();
		h.m1();
		
		
	}

}
