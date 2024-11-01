package ExceptionHandlings;

 class p5_UserDefinedExceptions1
{

	//This is user defined exception //
	public static void main(String[] args)
	{

		try
		{
			throw new Raja("This is Rajas exception");
		}
		catch(Raja r)
		{
			System.out.println(r);
			System.out.println(r.getMessage());
		}
		
	}

}

//This is our own exception //
class Raja extends Exception
{
	public Raja(String str)
	{
		super(str);
		
	}
}
// This is user defined Exceptions //
public class p5_UserDefinedExceptions
{
	public static void main(String[] args)
	{
	try
	{
		throw new Dev("This is dev Calss");
	}
	catch(Dev d)
	{
		System.out.println(d);
		System.out.println(d.getMessage());
		
	}
	
}
}
//This is our own Exception //
 class Dev extends Exception
{
	 public Dev(String str)
	 {
		 super(str);
		 
	 }
	
}






