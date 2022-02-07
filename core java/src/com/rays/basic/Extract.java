package com.rays.basic;

public class Extract {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Vijay Chauhan");
		s.delete(6, 13);
		System.out.println(s);
	}

}
