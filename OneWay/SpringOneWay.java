package OneWay;

public class SpringOneWay
{
	/*Here it is has Relation Ship
	 * here we create manager object and in that manager class we given team lead ref we didnot 
	 * given object of team lead ,the object we create in mainmethod and the manager set method 
	 * is set pass ref to team lead .
	 * 
	 * in same like developer object is create in main method  the ref is pass to team lead set method
	 * 
	 */

	public static void main(String[] args)
	{
		System.out.println("--Main thread started--");
		Manager m = new Manager();
		
		Teamlead t = new Teamlead();
		m.setT(t);
		
		Developer dev = new Developer();
		t.setT(dev);
		
		
		m.dowork();
		System.out.println("--Main Thread is ended--");
	}

}

 class Manager
{
	private Teamlead t ;
	
	public void setT(Teamlead t)
	{
		this.t = t;
	}


	public void dowork()
	{
		System.out.println("Start manager operation");
		t.dowork();
		System.out.println("end manager operation");
	}
}
///------------------------------------------------------------------///

class Teamlead
{
	
	private Developer t;
		
	public void setT(Developer t)
	{
		this.t = t;
	}


	public void dowork()
	{
		System.out.println("Start teamlead operation");
		t.dowork();
		System.out.println("end Teamlead operation");
	}		
}

//---------------------------------------------------------------------//

class Developer
{
	public void dowork()
	{
		System.out.println("Start Develoepr operation");
		
		System.out.println("end Developer operation");
	}
}

//-------------------------------------------------------------------------//