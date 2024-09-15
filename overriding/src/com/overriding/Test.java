package com.overriding;

class Tv{
	public void switchON() {
		System.out.println("parent:Tv is switch ON");
	}
	public void changeChannel() {
		System.out.println("parent:Tv channel is changed");
	}
	public void searching() {
		System.out.println("parent:Tv channel is searching");
	}
}
class smartTv extends Tv{
	public void switchON() {
		System.out.println("child:Smart Tv is switch ON");
	}
	public void changeChannel() {
		System.out.println("child:Smart Tv channel is changed");
	}
	public void browsing() {
		System.out.println("child:Smart Tv is browsing");
	}
}

public class Test {

	public static void main(String[] args) {
		
		Tv t = new Tv();
		t.switchON();
		t.changeChannel();
		System.out.println("--------------------------------------------");
		smartTv s = new smartTv();
		s.switchON();
		s.browsing();
		System.out.println("--------------------------------------------");
		Tv n = new smartTv();
		n.switchON();
		n.changeChannel();
		n.searching();
	}

}
