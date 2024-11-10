package com.consumer;

import java.util.function.IntConsumer;

public class Test1 {

	public static void main(String[] args) {


		IntConsumer c = new IntConsumer() {
			
			@Override
			public void accept(int value) {
				System.out.println("anonymous: "+value);
				
			}
		};
		c.accept(54);
		System.out.println("---------------------------------");
		
		IntConsumer c1 = (int value)->{System.out.println("lambda expression: "+value);};
		c1.accept(45);
		
		System.out.println("-------------------------------------------");
		
		IntConsumer c2 = test :: m1;
		c2.accept(125);
	}

}
