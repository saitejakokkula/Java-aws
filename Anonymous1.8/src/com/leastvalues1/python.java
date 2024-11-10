package com.leastvalues1;

public class python {
	
	public int greatervalues(int[] data) {
		
	   int greate = data[0];
	   
	   for(int i=1;i<=data.length-1;i++) {
		   
		   
		   if(greate <= data[i]) {
				
				greate = data[i];
				
			}
		}
		return greate;

		   
	   }

}
