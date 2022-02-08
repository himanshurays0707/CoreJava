package com.rays.oop;

public class Testperson {
	public static void main(String[] args) {
		Person p;
		p=new Person();
		p.setName("Ram");
		p.setDob("07/02/2001");
		p.setAddress("Ujjain");
		p.setAvg_age(21);
		System.out.println(p.getName());
		System.out.println(p.getDob());
		System.out.println(p.getAddress());
		System.out.println(p.getAvg_age());
	}

}
