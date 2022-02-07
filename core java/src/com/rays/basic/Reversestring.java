package com.rays.basic;

public class Reversestring {
	public static void main(String[] args) {
		String s = "Dream Big";
		String rs="";
		for (int i= s.length()-1;i>=0;i--) {
			rs= rs+s.charAt(i);
	
		}
		System.out.println("Original string : "  +s);
		System.out.println("Reverse string : "  +rs);
	}

}
