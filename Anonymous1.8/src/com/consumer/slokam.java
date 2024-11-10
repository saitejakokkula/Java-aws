package com.consumer;

import java.util.function.BiConsumer;

public class slokam {

	public static void main(String[] args) {
		
		
		BiConsumer c = new BiConsumer<Integer, Integer>() {

			@Override
			public void accept(Integer a, Integer b) {
				System.out.println("anonymous: "+(a+b));
				
			}			
		};
		c.accept(25, 10);
		
		System.out.println("------------------------");
		
		BiConsumer<Integer,Integer> c1 = (Integer a, Integer b)->{System.out.println("lambda expression: "+(a+b));};
		c1.accept(40, 25);
		
		System.out.println("-------------------------------");
		
		BiConsumer<Integer, Integer> c2 = test :: m1;
		c2.accept(125, 45);
	}

}
