package com.overriding;

class Car{
	public void start() {
		System.out.println("parent:car is start");
	}
	public void accelerate() {
		System.out.println("parent:car is accelerated");
	}
	public void changeGear() {
		System.out.println("parent:car gear changed");
	}
	public void stop() {
		System.out.println("parent:car is stoped");
	}
}
class LuxaryCar extends Car{
	@Override
	public void changeGear() {
		System.out.println("child:Automatic gear");
	}
	public void openRoof() {
		System.out.println("child:sun roof is opened");
	}
	@Override
	public void stop() {
		System.out.println("child:car is stoped");
	}
}

public class Overriding {

	public static void main(String[] args) {
		
		Car c = new LuxaryCar();
		c.start();
		c.changeGear();
		c.stop();
		c.accelerate();
	}

}
