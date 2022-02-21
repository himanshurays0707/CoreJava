package com.rays.oop;

public class Personoverloading {
	private String name;
	private String address;
	private String dateofbirth;
	
	public Personoverloading() {}
	public Personoverloading (String name,String address) {
		this.name=name;
		this.address=address;
	}
	public Personoverloading(String n,String a,String d) {
		name=n;
		address=d;
		dateofbirth=a;
	}

}
