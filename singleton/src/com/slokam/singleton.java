package com.slokam;

public class singleton {
	
	// Private constructor to restrict instantiation from other classes
	private singleton() {
		
	}
	
	private static  singleton singleton = null;

	// Public method to provide access to the single instance, with lazy initialization
	public static singleton getSingle() {
		if(singleton == null) {
			
			synchronized (singleton.class) {
				
				singleton = new singleton();
			}
		}
		return singleton;
	}
	
	public void message() {
		System.out.println("hello singleton --!");
	}
	

}
