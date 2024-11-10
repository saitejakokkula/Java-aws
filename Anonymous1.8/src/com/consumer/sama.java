package com.consumer;

import java.util.function.Consumer;

public class sama {
	
	public static void main(String[] args) {
		
		Consumer c = new Consumer(){

			@Override
			public void accept(Object t) {
				System.out.println(t);
				
			}
		};
		c.accept("sai");
		
		System.out.println("-------------------------------------");
		
		Consumer c1 = (Object t1)->{System.out.println(t1);};
		c1.accept("teja");
		
		
		System.out.println("------------------------");
		
		Consumer e = test :: m1;
		e.accept("tejuo");
	}
	
	
	
	
}
