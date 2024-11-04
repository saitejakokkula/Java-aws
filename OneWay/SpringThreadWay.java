package OneWay;

public class SpringThreadWay
{

	public static void main(String[] args)
	{
		Manager2 m = new Manager2();
		
		m.dowork();
		//It is when we call the m.dowark it will go to teamlead.
		//and object is created and it calls to developer and it
		//will be create another object .
	}

}

class Manager2
{
		private Teamlead2 t  = null;
		public void dowork()
		{
			System.out.println("Start manager operation");
			t = new Teamlead2();
			t.dowork();
			System.out.println("end manager operation");
		}
}

///------------------------------------------------------------------///

class Teamlead2
{
	private Developer2 t = null;
	public void dowork()
	{
		System.out.println("Start teamlead operation");
		t = new Developer2();
		t.dowork();
		System.out.println("end Teamlead operation");
	}	
}

//---------------------------------------------------------------------//

class Developer2
{
	public void dowork()
	{
		System.out.println("Start Develoepr operation");
		System.out.println("end Developer operation");
	}
}

//-------------------------------------------------------------------------//