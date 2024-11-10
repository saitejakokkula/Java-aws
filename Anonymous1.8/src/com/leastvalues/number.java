package com.leastvalues;

public class number implements least {

	@Override
	public int findleastnumber(int[] data) {
		
		int least = data[0];
		
		for(int i = 1;i<=data.length-1;i++) {
			
			if(least >= data[i]) {
				
				least = data[i];
				
			}
		}
		return least;

	}
	
}
