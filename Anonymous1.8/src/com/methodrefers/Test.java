package com.methodrefers;

public class Test {

	public static void main(String[] args) {
		
		sam s = new sam();
		A1 a1 = s :: add;
		
		s.add(25, 25);
	}

}
