package com.slokam;

public class hi {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			System.out.println("hii-1");
			System.out.println(10/0);
			try {
				System.out.println("hii-2");
				System.out.println(10/2);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("try");
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("End");
	}

}
