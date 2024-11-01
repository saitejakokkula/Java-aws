package ExceptionHandlings;

 class p4_FinallyBlock1
{

	public static void main(String[] args)
	{
		//In between of try catch and finally we don"t write any code.
		// Without no exception
		//Final block will be execute normally
		//Catch block won"t execute there is no exception
	
		
		try
		{
			System.out.println(25/5);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
				System.out.println("finally block executed succesfully");
		}
		
		System.out.println("----Program is completed-----");
		
	}

}
 
 class p4_FinallyBlock2
 {
	 //When exception occurs and not handled by catch block.
	 
	 public static void main(String[] args)
	{
		
		 try
		 {
			 System.out.println(25/0);
		 }
		 catch(NullPointerException e)
		 {
			 System.out.println(e);
		 }
		 finally
		 {
			 System.out.println("Finalll block is execiuted");
		 }
		 
		 System.out.println("Rest of the code"); 
	}
 }
 
 public class p4_FinallyBlock
 {
	 //Exception is handeled by catch block//
	 
	 public static void main(String[] args)
	{
		try
		{
		 System.out.println(10/0);
		// System.out.println("Baby");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Baby");
			
		}
		finally
		{
			System.out.println("Final block is executed");
		}
		
		System.out.println("Rest of the code ");
		 
	}
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
