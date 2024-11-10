package com.function;

import java.util.function.Function;

public class ram {

	public static void main(String[] args) {
		
		Function<String, String> f = new Function<String, String>() {

			@Override
			public String apply(String name) {
				
				System.out.println(name);
				return name+"@gmail.com";
			}
		};
		String email = f.apply("sai");
        System.out.println("Generated Email: " + email);
        
        System.out.println("--------------------------------------------");
        
        Function<String, String> f1 = (String name)->{
        	
        	System.out.println(name);
        	return name+"@gmail.com";
        };
        String email1 = f.apply("ajay");
        System.out.println("Generated Email: " + email1);
        
        System.out.println("-----------------------------------");
        
        Function<String, String> f2 = Test :: m1;
        String email2 = f2.apply("ram");
        System.out.println("Generated Email: "+ email2);
        
        

}
}
