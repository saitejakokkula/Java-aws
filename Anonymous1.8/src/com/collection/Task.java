package com.collection;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Task {

	public static void main(String[] args) {


		List<String> s = Arrays.asList("sai","madhu","raju","zam");
		
		s.stream().forEach((x)->{System.out.println(x);});
		
		System.out.println("---------------------------------------------");
		
	List<String> data = s.stream().collect((Collectors.toList()));
	System.out.println(data);
	
	System.out.println("-------------------------------------");
	
    Long l = s.stream().count();
    System.out.println(l);
    
    System.out.println("-------------------------------------");
    
    
   Optional<String> st =  s.stream().max((x, y)->{return x.compareTo(y);});
   System.out.println(st);
   
   System.out.println("---------------------------------------------");
   
   Optional<String> st1 =  s.stream().min((x, y)->{return x.compareTo(y);});
   System.out.println(st1);
   
   System.out.println("-------------------------------------------");
   
   boolean flag = s.stream().anyMatch((a)->{return a.length() >= 5;});
   System.out.println(flag);
   
   System.out.println("-----------------------------------------------");
   
   boolean flag1 = s.stream().allMatch((a)->{return a.length() >= 5;});
   System.out.println(flag1);
   
   System.out.println("-----------------------------------------------");
   
   boolean flag2 = s.stream().noneMatch((a)->{return a.length() >= 5;});
   System.out.println(flag2);

	}

}
