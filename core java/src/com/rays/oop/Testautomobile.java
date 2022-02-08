package com.rays.oop;

public class Testautomobile {
	public static void main(String[] args) {
		Automobile a;
		a= new Automobile();
		a.setMake("HONDA");
		a.setColor("BLACK");
		a.setNO_OF_GEARS(6);
		a.setSpeed(80);
		System.out.println(a.getMake());
		System.out.println(a.getColor());
		System.out.println(a.getNO_OF_GEARS() + " GEAR");
		System.out.println(a.getSpeed() + "KM/H");
	}

}
