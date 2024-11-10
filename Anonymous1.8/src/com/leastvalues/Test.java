package com.leastvalues;

public class Test {

	public static void main(String[] args) {
		
		
		int[] data = {45,5,78,2,10};
		number n = new number();
		
		least l = n :: findleastnumber;
		int s = l.findleastnumber(data);
		
		System.out.println(s);
	}

}
