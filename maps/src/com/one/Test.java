package com.one;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test {

	public static void main(String[] args) {
		
		
		LinkedHashMap<String, Integer> h = new LinkedHashMap();
		h.put("adithya", 101);
		h.put("ram", 102);
		h.put("madhiva", 103);
		h.put("theju", 104);
		
		System.out.println(h);
		
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.containsValue(102));
		System.out.println(h.containsKey("ram"));
		System.out.println(h.entrySet());
		h.put("akshitha", 104);
		System.out.println(h);

	}

}
