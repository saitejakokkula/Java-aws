package com.supplier;

import java.util.function.Supplier;

public class Test1 {

	public static void main(String[] args) {
		
		Supplier<emp> s = new Supplier<emp>() {

			@Override
			public emp get() {
				
				emp e = new emp();
				e.setEid(1);
				e.setEname("sai");
				e.setEage(25);
				e.setEdegs("se");
				return e;
			}
		};
		emp p = s.get();
		System.out.println(p);
		
		System.out.println("------------------------");
		
		Supplier<emp> s1 = ()->{
			emp e = new emp();
			e.setEid(1);
			e.setEname("sai");
			e.setEage(25);
			e.setEdegs("se");
			return e;
		};
		emp p1 = s1.get();
		System.out.println(p1);
		
		System.out.println("-------------------------");
		
		Supplier<emp> s2 = Test :: get;
		emp p2 = s2.get();
		System.out.println(p2);
	}

}
