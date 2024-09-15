package com.one;

import java.util.TreeMap;

public class slokam2 {

	public static void main(String[] args) {


		TreeMap<String , Integer> a = new TreeMap();
		a.put("sam", 30);
		a.put("rahul", 32);
		a.put("raju", 33);
		a.put("akshu", 31);
		a.put("shekar", 35);
		
		System.out.println(a);
		System.out.println(a.containsKey("raju"));
		System.out.println(a.containsValue(36));
		System.out.println(a.lastKey());
		System.out.println(a.size());
		System.out.println(a.keySet());
		System.out.println(a.firstEntry());
	}

}
