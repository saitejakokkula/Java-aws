package com.one;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class sam {

	public static void main(String[] args) {


		HashMap<emp, Integer> data = new HashMap();
		data.put(new emp(101, "ram", 564.8), 40);
		data.put(new emp(102, "madhiva", 456.32), 41);
		data.put(new emp(104, "sam", 756.3), 44);
		data.put(new emp(105, "theja", 523.3), 43);
		
		System.out.println(data);
		
		System.out.println("-------------------------------------------------");
		
		
	    Iterator<emp> b = data.keySet().iterator();
	    
	    while(b.hasNext()) {
	    	
	    	System.out.println(b.next());
	    	
	    }
	    
	    System.out.println("------------------------------------------------");
	    for(Entry<emp, Integer> s : data.entrySet()) {
	    	
	    	System.out.println(s);
	    }
	}

}
