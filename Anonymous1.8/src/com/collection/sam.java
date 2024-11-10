package com.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class sam {

	public static void main(String[] args) {


		List<Integer> data = Arrays.asList(45,22,86,35,75,10,22,86,75,85);
		
		
		Predicate<Integer> s3 = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				if(t%2==0)
					return true;
				else
				return false;
			}
		};
		
		
		Function<Integer, Integer> s1 = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t*t;
			}
		};
		
		
		Comparator<Integer> s2 = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer x, Integer y) {
				// TODO Auto-generated method stub
				return x.compareTo(y);
			}
		};
		//Consumer return type is void 
		//Predicate return type is boolean
		//using lambda expression
		data.stream().distinct()
		.filter((a)->{if(a%2==0)return true; else return false;})
		.map((a)->{ return (a*a);})
		.sorted((x, y)->{return -x.compareTo(y);})
		.forEach((a)->{System.out.println(a);});
		
		System.out.println("---------------------------------------------------");
		
//		//using method refer
//		data.stream().filter(akshu :: evenno).forEach(akshu :: even);
//		
//	System.out.println("---------------------------------------------------------");
//		
	
	data.stream().forEach((a)->{System.out.println(a);});
	
	System.out.println("-------------------------------------");
	
	
	List<Integer> l =  data.stream().collect(Collectors.toList());
	System.out.println(l);
	
	System.out.println("----------------------------");
	
	long e = data.stream().count();
	System.out.println(e);
	
	System.out.println("--------------------------------");
	
	Optional<Integer> o =  data.stream().max((x, y)->{ return x.compareTo(y);});
	
	System.out.println(o);
	
	System.out.println("--------------------------------------");
	
	Optional<Integer> p =   data.stream().min((x, y)->{return x.compareTo(y);});
	
	System.out.println(p);
	
	System.out.println("-----------------------------------------");
	
	boolean flag = data.stream().anyMatch((s)->{if(s%2 ==0) return true; else return false;});
	System.out.println(flag);
	
	System.out.println("-----------------------------------------");
	boolean flag1 = data.stream().allMatch((s)->{if(s%2 ==0) return true; else return false;});
	System.out.println(flag1);
	
	System.out.println("--------------------------------------");
	
	boolean flag2 = data.stream().noneMatch((s)->{if(s%2 ==0) return true; else return false;});
	System.out.println(flag2);
	
	Optional<Integer> r = data.stream().findFirst();
	System.out.println(r);
	
	System.out.println("---------------------------------------");
	
	Optional<Integer> t =   data.stream().findAny();
	System.out.println(t);
	}

}
