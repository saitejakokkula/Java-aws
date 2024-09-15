package com.one;

import java.util.Hashtable;
import java.util.Map.Entry;

public class sk {

	public static void main(String[] args) {


		Hashtable<emp, Integer> t = new Hashtable();
		t.put(new emp(40, "sai", 456.3), 101);
		t.put(new emp(41, "akshu", 856.3), 103);
		t.put(new emp(43, "ram", 756.3), 102);
		t.put(new emp(42, "madhu", 656.36), 104);
		t.put(new emp(42, "madhu", 656.36), 105);
		
		for(Entry<emp, Integer> s : t.entrySet()) {
			
			System.out.println(s);
		}

	}

}
