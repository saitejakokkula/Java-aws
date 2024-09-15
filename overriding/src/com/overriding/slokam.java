package com.overriding;

class bike {
	
	public void switchON() {
		System.out.println("parent:bike is started");
	}
	public void acclerates() {
		System.out.println("parent:bike is acclerates");
	}
}
class superbike extends bike{
	
	public void Gear() {
		System.out.println("child:superbike is Automicate Gear");
	}
	@Override
	public void acclerates() {
		System.out.println("child:superbike is acclerates more");
	}
	
}

public class slokam {

	public static void main(String[] args) {
		
		superbike s = new superbike();
		s.switchON();
		s.acclerates();
		s.Gear();
	}

}
