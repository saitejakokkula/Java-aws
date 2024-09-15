package com.one;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class slokam {

	public static void main(String[] args) {
		
		
		HashMap<String , Integer> k = new HashMap();
		k.put("madhu", 40);
		k.put("vivek", 41);
		k.put("gopal", 42);
		k.put("adithya", 44);
		k.put("sam", 43);
		
	    for(Entry<String, Integer> data : k.entrySet()) {
	    	
	    	System.out.println(data);
	    }
	    System.out.println("------------------------------------");
	    
	    for(String s : k.keySet()) {
	    	
	    	System.out.println(s+"-----------"+k.get(s));
	    }
	    System.out.println("-------------------------------");
	    
	    Collection<Integer> a = k.values();
	    for(Integer b : k.values()) {
	    	
	    	System.out.println(b);
	    }
	    System.out.println("----------------------------------");
	    
	   Iterator<Entry<String , Integer>> data =  k.entrySet().iterator();
	   
	   while(data.hasNext()) {
		   System.out.println(data.next());
	   }
	   
	   System.out.println("--------------------------------------------");
	   
	   
	  Iterator<String> g =  k.keySet().iterator();
	  
	  while(g.hasNext()) {
		  String at = g.next();
		  System.out.println(at+"----"+k.get(at));
	  }
	  
	}

}
