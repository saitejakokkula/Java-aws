package com.Threadfuuctional;

import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {


		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				
			}

	};
	Thread t = new Thread(r);
	t.start();
	
	System.out.println("--------------------------");
	
	
	Runnable k1 = ()->
	{
		System.out.println(Thread.currentThread().getName());
	};
	
	Thread t1 = new Thread(k1);
	t1.start();
	
	System.out.println("----------------------------------");
	
	
	}
}
