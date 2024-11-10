package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {
	
	
	public static void main(String[] args) {
		
		List<String> s = Arrays.asList("sam, raju, akshu, madhu, sai");
		
		Consumer<String> data = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		s.forEach(data);
		
		System.out.println("----------------------------------------------");
		
		Consumer<String> data1 = (a)->{System.out.println(a);};
		s.forEach(data1);
		
		System.out.println("-----------------------------------------------");
		
		s.stream().forEach((b)->{System.out.println(b);});
		
		System.out.println("------------------------------------------------");
		
	}

	public static void main1(String[] args) {


		List<Double> data = Arrays.asList(56.25,75.33,78.12,78.36,89.36);
		
		Consumer<Double> c = new Consumer<Double>() {
			
			@Override
			public void accept(Double t) {
				
				System.out.println(t);
			}
		};
		data.forEach(c);
		
		System.out.println("------------------------------------------------");
		
		Consumer<Double> data1 = (a)->{System.out.println(a);};
		data.forEach(data1);
		
		System.out.println("-----------------------------------");
		
		data.stream().forEach((b)->{System.out.println(b);});
		
		System.out.println("-------------------------------------------------");
		
	}

}
