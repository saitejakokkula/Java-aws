package com.functionalinterface;

public class Test {
	
	public static void main(String[] args) {
		
		
		
		sample s =(int a, int b)->{
			System.out.println(a+b);
			return 0;
			
		};
		s.ename(50, 10);
		s.m1();
		s.m2();
		sample.m3();
		sample.m4();
		
		System.out.println("--------------------------------");
		
		sample t = new sample(){

			@Override
			public int ename(int a, int b) {
				System.out.println(a+b);
				return 0;
			}};
			t.ename(10, 10);
			t.m1();
			t.m2();
			sample.m3();
			sample.m4();
			
			System.out.println("--------------------");
			
			sam z = new sam();
			sample q = z::ename;
			int e = q.ename(10, 20);
			System.out.println(e);
			q.m1();
			q.m2();
			sample.m3();
			sample.m4();
			
	}

}
