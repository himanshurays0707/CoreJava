package com.rays.oop;

import java.util.*;

public class Iteratorrr {
	public static void main(String[] args) {
		ArrayList n = new ArrayList();
		n.add("Ram0");
		n.add("Ram1");
		n.add("Ram2");
		n.add("Ram3");
		n.add("Ram4");
		n.add("Ram5");
		Iterator it =  n.iterator();
		while(it.hasNext()) {
			Object o= it.next();
			//System.out.println(o);
			System.out.println(it.next());
		}	
	}
}