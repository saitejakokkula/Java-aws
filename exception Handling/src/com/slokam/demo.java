package com.slokam;

public class demo {
	
	public void m1() {
		System.out.println("m1 started");
		m2();
		System.out.println("m1 ended");
	}
	public void m2() {
		System.out.println("m2 Started");
		m3();
		System.out.println("m2 ended");
	}
	public void m3() {
		System.out.println("m3 Started");
		
		System.out.println("m3 ended");
	}

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		demo d = new demo();
		d.m1();
		System.out.println("Main ended");

	}

}
