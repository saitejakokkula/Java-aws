package com.Three;

public class Test {

	public static void main(String[] args) {
		
		
		A1 k = (int a,int b)->{
			
			System.out.println(a+b);
		};
		System.out.println(k);  // lambda address
		k.m1(10, 10);
		System.out.println("-------------------");
		
		A2 t = (int a, int b)->{
		return a*b;
		};
		System.out.println(t);
		int s = t.mul(2, 4);
		System.out.println(s);

		
	}

}
