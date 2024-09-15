package com.one;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test2 {

	public static void main(String[] args) {


		LinkedHashMap<Test1, Test3> m = new LinkedHashMap();
		m.put(new Test1(101, "adit", 56.36),new Test3(105, "teja", "Hyd"));
		m.put(new Test1(102, "sam", 75.36), new Test3(106, "gaya", "scd"));
		m.put(new Test1(104, "aku", 96.36), new Test3(103, "roja", "hyd"));
		
		System.out.println(m);
		

	}

}
