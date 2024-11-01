package ExceptionHandlings;

import java.io.IOException;

class p6_ExceptionPropagation1
{
	
	public static void m1()
	{
		System.out.println(10/0);
	}
	
	public static void m2()
	{
		m1();
	}
	
	public static void m3()
	{
		try
		{
		m2();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Exception is handiled");
		}
	}

	
	public static void main(String[] args)
	{
		m3();
		
		System.out.println("the Normal floww");
	}
	
}


public class p6_ExceptionPropagation
{
	/*
	 * Checke Exceptions are compilation error it is showing //
	 * 
	 */
	
	/*
	public static void m1()
	{
		throw new IOException("Device error");
	}
	
	public static void m2()
	{
		m1();
	}
	
	public static void m3()
	{
		m2();
	}
	
	public static void main(String[] args)
	{
		m3();
	}
	  */
	
}


