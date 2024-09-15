package com.slokam;

public class Teja {
	
	public void m1() {
		System.out.println("m1 started");
		try {
		m2();
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("m1 ended");
	}
	public void m2() {
		System.out.println("m2 started");
		m3();
		System.out.println("m2 ended");
	}
	public void m3() {
		System.out.println("m3 started");
		try {
		m4();
		System.out.println(10/0);
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("m3 ended");
	}
	public void m4() {
		System.out.println("m4 started");
		try {
			m5();
			String[] a = {"sai","teja","madhiva"};
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("m4 ended");
	}
	public void m5() {
		System.out.println("m5 started");
		
		System.out.println("m5 ended");
	}

	public static void main(String[] args) {

		System.out.println("main started");
		Teja t = new Teja();
		t.m1();
		System.out.println("main ended");
	}

}
