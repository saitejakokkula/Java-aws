package com.function;

import java.util.function.BiFunction;

public class siva {

	public static void main(String[] args) {
		
		BiFunction<String, String, String> b = new BiFunction<String, String, String>() {
			
			@Override
			public String apply(String t, String u) {
				return t+u;
			}
		};
		String s = b.apply("sai", "Teja");
		System.out.println(s);
		
		System.out.println("------------------------------------------------");
		
		BiFunction<String, String, String> b1 = (String f, String l)->{
			return f+l;};
			String s1 =b1.apply("madhu", "sk");
			System.out.println(s1);
			
			System.out.println("---------------------------------------------");
			
			BiFunction<String, String, String> b2 = Test :: m1;
			String s2 = b2.apply("krishna", "sam");
			System.out.println(s2);
	}

}
