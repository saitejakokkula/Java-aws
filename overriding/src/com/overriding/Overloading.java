package com.overriding;

public class Overloading {
	
	public int add(int a, int b, int c) {
		
		int s = a+b+c;
		System.out.println("Adding:"+s);
		return s;
	}
	public int add(int x, int y) {
		
		int a = x+y;
		System.out.println("Adding:"+a);
		return a;
	}
	public double add(double a, double b) {
		
		double y = a+b;
		System.out.println("Adding:"+y);
		return y;
	}
	

	public static void main(String[] args) {
		
		Overloading o = new Overloading();
		o.add(56, 75, 86);
		o.add(25, 75);
		o.add(25.3, 65.4);
		

	}

}
