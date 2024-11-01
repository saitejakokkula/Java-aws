package ExceptionHandlings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

class p4_UsingThrow1
{
	//Unchecked Throw the exception //
	
	public void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not eligible for Vote");
		}
		else
		{
			System.out.println("Eligible for Vote");
		}
	}
	
	public static void main(String[] args)
	{
		//p4_UsingThrow p = new p4_UsingThrow();
		//p.validate(13);
		
		System.out.println("Rest of code will be execute");
	}

}

  class p4_UsingThrow2
 {
	 //Throw The Checked Exception
	 
	 
	 public static void file() throws FileNotFoundException
	 {
		 FileReader re = new FileReader("C:\\venkyfee\\Radha.txt.txt");
		 BufferedReader br = new BufferedReader(re);
		 
		 
		 throw new FileNotFoundException();
		
	 }
	 
	 public static void main(String[] args)
	{
		 try
		 {
			 file();
		 }
		 catch(FileNotFoundException e)
		 {
			 System.out.println(e);
		 }
		
		 System.out.println("We find the path");
	}
 }
  