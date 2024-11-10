package com.consumer;

import java.util.function.Consumer;

public class test {
	
	public static void m1(Object t) {
		
		System.out.println("----"+t);
	}
	
	public static void m1(int a, int b) {
		
		System.out.println("----"+(a+b));
	}
	
	public static void m1(int a) {
		System.out.println("----"+a);
	}
	
	public static void m1(double b) {
		System.out.println("---"+b);
	}
}
