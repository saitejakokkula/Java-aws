package ExceptionHandlings;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class p2_UsingMultipleCatchs1
{
	//Using multiple Catches //
	
	public static void main(String[] args)
	{
		try
		{
		System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndex Exception="+e);
		}
		catch(NullPointerException e)
		{
			System.out.println("null Pointer Exception"+e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithematic Exception--"+e); 
		}	
	}

}
 
 
 class p2_UsingMultipleCatchs2
 {
	 public static void main(String[] args)
	{
		 //Parent exception will be execute.
		int[] a = new int[5];	
		try
		{
			a[10]=3;
		System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Parent exception="+e);
		}	
	}
 }
 
 public class p2_UsingMultipleCatchs
 {
	 //We have to give exceptions in a specific order othervice compile time error will be execute.
	 public static void main(String[] args)
	{
		 try
		 {
		System.out.println(10/0);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		/* catch(ArithmeticException e)
		 {
			 System.out.println(e);
		 }   */ 
	}
 }
 
