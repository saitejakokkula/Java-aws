package com.Threadfuuctional;

import java.util.function.Consumer;

public class akshu extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		akshu a = new akshu();
		
		Thread t = new Thread(a);
		t.start();
		
	}

}
