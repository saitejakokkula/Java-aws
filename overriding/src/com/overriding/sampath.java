package com.overriding;

class A1{
	public int m1(int n) {
		int Fact = 1;
		for(int i=1;i<=n;i++) {
			Fact = Fact*i;
		}
		return Fact;
	}
	public double m2(double d) {
		return d;
	}
}
class B1 extends A1{
	@Override
	public int m1(int n) {
		int Fact = 1;
		for(int i=1;i<=n;i++) {
			Fact = Fact*i;
		}
		return Fact;
	}
	public String m3(String name) {
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		return name;
	}
	
}

public class sampath {

	public static void main(String[] args) {
		
		B1 b = new B1();
		int x = b.m1(5);
		System.out.println(x);
		double y = b.m2(23.53);
		System.out.println(y);
		String s = b.m3("Sai");
		System.out.println(s);
	}

}
