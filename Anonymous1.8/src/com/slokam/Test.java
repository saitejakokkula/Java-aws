package com.slokam;

public class Test {

	public static void main(String[] args) {

		A a = new A() {

			@Override
			public void m1() {
				System.out.println("hi");			
				
			}};
			a.m1();
			
			System.out.println("---------------------------");
			
			B b = new B(){


				@Override
				void m2() {
					System.out.println("Hello slokam");
					
				}

				@Override
				public void m1() {
					System.out.println("Hi slokam");
					
				}};
				b.m1();
				b.m2();
	}

}
