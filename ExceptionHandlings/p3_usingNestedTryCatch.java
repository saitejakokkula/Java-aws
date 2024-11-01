package ExceptionHandlings;

 class p3_usingNestedTryCatch1
{

	public static void main(String[] args)
	{
		/*When any try block does not have a catch block for a particular exception, 
		 * then the catch block of the outer (parent) try block are checked for that exception, 
		 * and if it matches, the catch block of outer try block is executed.
		 * If none of the catch block specified in the code is unable to handle the exception,
		 *  then the Java runtime system will handle the exception.
		 *   Then it displays the system generated message for that exception.
		 */
		// Try Block with another tryblock of two exceptions 
		
		
		try
			{
			//inner try block 1 --- //
				try
					{
						System.out.println("Devisible by zero");
						int a = 10/0;
					}
				catch(ArithmeticException e)
					{
							System.out.println(e);
					}
				
				//inner Try Block ------2 //
				try
					{
						int a[] = new int[2];
						a[4]= 8;
					
						System.out.println(a[4]);
					}
				catch(ArrayIndexOutOfBoundsException e)
					{
						System.out.println(e);
					}
			}
		catch(Exception e)
			{
				System.out.println("--Parent Exception---"+e);
			}
	}

}

 
 
 public class p3_usingNestedTryCatch
 {
	 /*Let's consider the following example.
	  *  Here the try block within nested try block (inner try block 2)
	  *  do not handle the exception.
	  *  The control is then transferred to its parent try block (inner try block 1).
	  *  If it does not handle the exception, then the control is transferred to the main
	  *  try block (outer try block) where the appropriate catch block handles the exception.
	  *  It is termed as nesting.
	  * 
	  */
	 
	 public static void main(String[] args)
	 {
		
		 try //Main try//
		 {
			 try //inner Try 1
			 {
				 
				 try //inner Try 2
				 {
					 try //inner try 3
					 {
						 int a[] = new int[2];
						 a[5] = 5;
						 System.out.println(a[5]);
					 }
					 catch(ArithmeticException e) //inner catch block 3//
					 {
						 System.out.println(e);
					 }
					 
				 }
				 catch(NullPointerException e) //inner catch block 2//
				 {
					 System.out.println(e);
					 
				 }
				 
			 }
			 catch(ArrayIndexOutOfBoundsException e) //inner catch 1//
			 {
				 System.out.println(e);
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println("main exception--"+e); // main catch//
		 }
	 }
 }
 
 
 
 
 
 
 
 
 