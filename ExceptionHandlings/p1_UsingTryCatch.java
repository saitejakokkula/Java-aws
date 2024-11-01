package ExceptionHandlings;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

class p1_UsingTryCatch1
{

	public static void main(String[] args)
	{
		// Using Try Catch block uncheched exception
		try
		{
			System.out.println(100/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("The Rest Of code will be execute");

	}
}

 class p1_UsingTryCatch2
{
	public static void main(String[] args)
	{
		//Unchecked exception 
		
		System.out.println(10/2);
		System.out.println(20/4);
		try
		{
		System.out.println(20/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println(20/5);
		System.out.println(20/5);
	}
}

 class p1_UsingTryCatch3
{
	
	public static void main(String[] args)
	{
		//it is encosed means it will joint//
		try
		{
		System.out.println(10/0);
		}
		//The exception is handlied in catch block only
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("The rest of code is executed");
		
		
	}
	
}

  class p1_UsingTryCatch4
 {
	 public static void main(String[] args)
	{
		try
		{
		 System.out.println(10/0);//The try block ecception code is will not execute //
	  System.out.println("Rest of code is not execute");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	 
 }

   class p1_UsingTryCatch5
  {
	  public static void main(String[] args)
	{
		  //Checked exceptions
		  try
		  {
			  System.out.println(10/0);
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
			System.out.println("---Rest of code will be executed--");
	}
  }
 
  class p1_UsingTryCatch6
 {
	 //Custom mesaage exception //
	 public static void main(String[] args)
	{
		 try
		 {
		 System.out.println(10/0);
		 }
		 catch(Exception e)
		 {
			 System.out.println("it can't devide by zero");
		 } 
		
	}
 }

  class p1_UsingTryCatch7
  {
	  //Resolve The Exception
	  public static void main(String[] args)
	{
		int i =50;
		int j = 0;
		
		try
		{
			int data = i/j;

		System.out.println(data);
		}
		catch (Exception e)
		{
			System.out.println(i/(j+2));
		}
	}
  }

   class p1_UsingTryCatch8
  {
	  //enclose in catch block we enclose the code 
	  public static void main(String[] args)
	{
		try
		{
		  int data1 =50/0;
		  
		}
		catch(Exception e)
		{
			int data2 = 50/0;
		}
		System.out.println("Lastcode");  
	}
  }
   
    class p1_UsingTryCatch9
   {
	   //Arthematic Exception Replace we give Array index Exception //
	 public static void main(String[] args)
	{
		try
		{
		 System.out.println(50/0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
   }
   
    class p1_UsingTryCatch10
   {
	   //Handled unchecked Exception
	   public static void main(String[] args)
	{
		   int arr[] = new int[3];
		   try
		   {
		   System.out.println(arr[10]);
		   }
		   catch(ArrayIndexOutOfBoundsException e)
		   {
			   System.out.println(e);
		   }
		
	}
   }
 public class p1_UsingTryCatch
 {
	 //Handled Checked Exceptions by cooecting the file
	 public static void main(String[] args)
	{
		 
		 PrintWriter w = null;
		 try
		 {
		 w = new PrintWriter("C:\\FileSample\\Raghu.txt");
		 w.print("Saved");
		 System.out.println("Executed");
		 }
		 catch(FileNotFoundException e)
		 {
			 System.out.println(e);
		 }
		
	}
 }
   