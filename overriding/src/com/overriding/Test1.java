package com.overriding;

class A{
	
	public void m1() {
		System.out.println("parent:hi");	
		}
	public void m2() {
		System.out.println("parent:good morning to all");
	}
}
class B extends A{
	
	@Override
	public void m1() {
		System.out.println("sub:Hello....!");
	}
	public void m3() {
		System.out.println("sub:how are you..!");
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		B c = new B();
		c.m1();
		c.m2();
		c.m3();
		System.out.println("-------------------------------------");
		A s = new B();
		s.m1();
		s.m2();
	}

}
