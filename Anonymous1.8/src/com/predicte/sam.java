package com.predicte;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class sam {
	
	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> b = new BiPredicate<Integer, Integer>() {

			@Override
			public boolean test(Integer t, Integer u) {
				if(t%2 ==0 && u%1 == 0) {
					return true;
				}else {
					return false;
				}
			}
		};
		Boolean a = b.test(24, 25);
		System.out.println(a);
		
		System.out.println("-------------------------------------");
		
		BiPredicate<Integer, Integer> b1 = (Integer t, Integer z)->{
			
			if(t%2 == 0 && z%1 == 0) {
				return true;
			}
			else {
				return false;
			}
		};
		Boolean s = b1.test(28, 23);
		System.out.println(s);
		
		System.out.println("------------------------");
		
		BiPredicate<Integer, Integer> b2 = Test :: getevenodd;
		Boolean q = b2.test(22, 31);
		System.out.println(q);
		
	}
	
	
	

	public static void main1(String[] args) {


		Predicate p = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				if(t%2 ==0) {
					return true;
				}else {
					return false;
				}
			}
		};
		boolean flag = p.test(21);
		System.out.println(flag);
		
		System.out.println("--------------------------------------");
		
		Predicate<Integer> p1 = (Integer t1)->{
			if(t1%2 == 0) {
				return true;
			}
			else {
				return false;
			}
		};
		boolean flag1 = p1.test(24);
		System.out.println(flag1);
		
		System.out.println("---------------------------");
		
		Predicate<Integer> p2 = Test :: getevenvalue;
		Boolean flag12 = p2.test(56);
		System.out.println(flag12);

	}

}
