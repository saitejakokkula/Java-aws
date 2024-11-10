package com.two;

public class Test {

	public static void main(String[] args) {

		
		A a = new A(){

			@Override
			public void m1(int a, int b) {
				
				System.out.println(a+b);
				
			}
			
		};
		a.m1(5, 10);
		
		System.out.println("------------------------");
		
		
	}

}
