package com.overriding;

class parent{
	public int m1(int a) {
		System.out.println("parent:"+a);
		return a;
	}
	public double m2(double t) {
		System.out.println("parent:"+t);
		return t;
	}
	public long m3(long number) {
		System.out.println("parent:"+number);
		return number;
	}
}
class child extends parent{
	public String m4(String name) {
		System.out.println("child:"+name);
		return name;
	}
	@Override
	public double m2(double t) {
		System.out.println("child:"+t);
		return t;
	}
}
public class sai {

	public static void main(String[] args) {
		
		parent a = new parent();
		a.m1(25);
		a.m2(23.56);
		a.m3(23L);
		System.out.println("---------------------------------------");
		child c = new child();
		c.m4("Sai");
		c.m2(23.26);
		System.out.println("---------------------------------------");
		parent p = new child();
		p.m1(25);
		p.m2(23.56);
		p.m3(25L);
	}

}
