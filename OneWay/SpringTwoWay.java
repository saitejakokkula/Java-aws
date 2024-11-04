package OneWay;

public class SpringTwoWay
{
	/*	Here it is automatic one it is calling one method to another method automaticaaly 
	 * object is created.This is automatic process.
	 * 
	 */

	public static void main(String[] args)
	{
			System.out.println("--Main Method is started--");
		
			Manager1 man = new Manager1();
			man.dowork();
		
			System.out.println("--Main Method is started--");
	}

}

class Manager1
{
	
	private Teamlead1 t  = new Teamlead1();
	
	public void dowork()
	{
		System.out.println("Start manager operation");
		t.dowork();
		System.out.println("end manager operation");
	}
}

///------------------------------------------------------------------///

class Teamlead1
{
	private Developer1 t = new Developer1();
	
	public void dowork()
	{
		System.out.println("Start teamlead operation");
		t.dowork();
		System.out.println("end Teamlead operation");
	}	
}

//---------------------------------------------------------------------//

class Developer1
{
	public void dowork()
	{
		System.out.println("Start Develoepr operation");
		
		System.out.println("end Developer operation");
	}
}

//-------------------------------------------------------------------------//