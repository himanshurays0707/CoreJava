package com.rays.oop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java .util.Iterator;

public class TestNameMarksheet {
	public static void main(String[] args) {
		Marksheet m1=new Marksheet();
		m1.setRollno("21");
		m1.setFname("Shyam");
		m1.setLname("Patel");
		m1.setPhysics(68);
		m1.setChemistry(69);
		m1.setMath(86);
	    
		Marksheet m2 = new Marksheet();
		m2.setFname("Ram");
		m2.setLname("Chouhan");
		m2.setRollno("56");
		m2.setChemistry(59);
		m2.setMath(45);
		m2.setPhysics(86);
		
		Marksheet m3 = new Marksheet();
		m3.setRollno("41");
		m3.setFname("Rohit");
		m3.setLname("Patel");
		m3.setChemistry(63);
		m3.setMath(65);
		m3.setPhysics(63);
		
		Marksheet m4 = new Marksheet();
		m4.setRollno("32");
		m4.setFname("Ram");
		m4.setLname("Kumar");
		m4.setChemistry(56);
		m4.setMath(65);
		m4.setPhysics(69);
		
		ArrayList a = new ArrayList();
		a.add(m1);
		a.add(m2);
		a.add(m3);
		a.add(m4);
		
		Collections.sort(a, new OrderByName());
		Iterator it = a.iterator();
		
		while(it.hasNext()) {
			Marksheet m = (Marksheet)it.next();
			System.out.println(m.getRollno()+ " "+ m.getFname()+ " "+ m.getLname()+ " "+ m.getMath()+ " "+ m.getPhysics()+ " "+ m.getChemistry());
		}
	}
}
