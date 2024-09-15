package com.slokam;

public class slokam {
	
	public static void main(String[] args) {
		
		int a = 10, b = 0, c;
		try {
			
		    c = a/b;
		    System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("----------------------");
		System.out.println("bye"); 
		
	}

}
