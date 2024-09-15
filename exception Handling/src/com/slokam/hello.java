package com.slokam;

public class hello {

	public static void main(String[] args) {
		System.out.println("start");
		String[] name = {"sai","teja"};
		try {
			System.out.println("hii-1");
			System.out.println("hii-2");
			System.out.println(10/2);
			System.out.println(name[3].length());
			}catch(ArithmeticException e) {
				System.out.println(e);
			}catch(Exception e) {
				System.out.println(e);
				
			}
		System.out.println("End");
	}

}
