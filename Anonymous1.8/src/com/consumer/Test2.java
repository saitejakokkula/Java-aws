package com.consumer;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

public class Test2 {

	public static void main(String[] args) {
		
		DoubleConsumer c = new DoubleConsumer() {
			
			@Override
			public void accept(double value) {
				System.out.println("anonymous: "+value);
			}
		};
		c.accept(52.36);
		System.out.println("----------------------------");
		
		DoubleConsumer c1 = (double value)->{System.out.println("lambda expression: "+value);};
		c1.accept(85.36);
		
		System.out.println("----------------------------------");
		
		DoubleConsumer c2 = test :: m1;
		c2.accept(875.36);
	}

}
