package com.slokam;

public class ram {

	public static void main(String[] args) {
		
		try {
			System.out.println("hi--1");
			System.out.println("hi--2");
			System.out.println(10/0);
			System.out.println("hi--3");
			System.out.println(10/5);
			System.out.println("hi--4");
		}catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}
