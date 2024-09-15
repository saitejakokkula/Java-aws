package com.one;

import java.util.Comparator;

public class sai implements Comparator <emp>

{

	@Override
	public int compare(emp e1, emp e2)
	{
		
		Integer x  = e1.getEid();
		Integer y = e2.getEid();
		
		return x.compareTo(y);
	}

	

}
