package com.one;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class slokam1 {

	public static void main(String[] args) {
		
		HashMap<String , Integer> k = new HashMap();
		k.put("madhu", 40);
		k.put("vivek", 41);
		k.put("gopal", 42);
		k.put("adithya", 44);
		k.put("sam", 43);
		
		Iterator<Entry<String , Integer>> data =  k.entrySet().iterator();
		   
		   while(data.hasNext()) {
			   System.out.println(data.next());
		   }
		   
		   System.out.println("--------------------------------------------");
		   
		   
		  Iterator<String> g =  k.keySet().iterator();
		  
		  while(g.hasNext()) {
			  System.out.println(g.next());
		  }


	}

}
