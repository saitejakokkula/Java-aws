package com.slokam;

public class Test {

	public static void main(String[] args) {
		
		
		singleton s1 = singleton.getSingle();
		s1.message();
		singleton s2 = singleton.getSingle();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
