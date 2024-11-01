package ExceptionHandlings;

import java.io.IOException;

 class p7_UsingThrows1
{
	//By using throws exception Checked Exceptions 
	public static void m1() throws IOException
	{
	throw new IOException("This is error");
	}
	
	public static void m2() throws IOException
	{
		m1();
	}
	
	public static void m3()
	{
		try
		{
		m2();
		}
		catch(IOException e)
		{
			System.out.println("got eception");
		}
	}
	public static void main(String[] args)
	{
		m3();
		
		System.out.println("Program is executed in the floww");
	}

}


// By using try/ catch block it will be throwng exception// 
  class p7_UsingThrows2
 {
	 
	 public static void m1()throws Exception
	 {
		 throw new IOException("It is error");
	 }
	 
	 public static void main(String[] args)
	{
		 try
		 {
		m1();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 
		 System.out.println("---It is handleed the exception--");
	} 
 }
 
 
   class p7_UsingThrows3
  { // No error Exception is handled
	  public static void m1() throws IOException
	  {
		  System.out.println("The exception is handled");
	  }
	  
	 public static void main(String[] args) throws IOException
	{
		 
		m1();
	}
  }

  public class p7_UsingThrows
  {
	  //No using throws exception is occured or not 
	  
	  public void m1() throws IOException
	  {
		  System.out.println("Exception");
		  throw new IOException();
	  }
	  
	  public static void main(String[] args) throws IOException
	{
	//	m1();
		
		System.out.println("The program will be go floww");
		//compilation error
	}
	  
  }







