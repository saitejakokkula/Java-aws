package com.functionalinterface;
@FunctionalInterface
public interface sample {
	
	public abstract int ename(int a, int b);
	
	
	default void m1()  {
		
		System.out.println("default method --m1");
	}
	default void m2() {
		System.out.println("default method --m2");
	}
	
	static void m3() {
		System.out.println("static method --m3");
	}
	static void m4() {
		System.out.println("static method --m4");
	}
	

}
