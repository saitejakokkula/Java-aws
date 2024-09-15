package com.one;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class ram {

	public static void main(String[] args) {
		
		
		TreeMap<emp, Integer> data = new TreeMap(new sai());
		data.put(new emp(40, "sai", 456.3), 101);
		data.put(new emp(41, "akshu", 856.3), 103);
		data.put(new emp(43, "ram", 756.3), 102);
		data.put(new emp(42, "madhu", 656.36), 104);
		
		
        for(Entry<emp, Integer> at : data.entrySet()) {
			
			System.out.println(at);
			
		}

	}

}
