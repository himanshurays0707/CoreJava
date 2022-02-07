package com.rays.basic;

public class Countcharacter {
	public static void main(String[] args) {
		String s ="Rays Indore";
		int c=0;
		for(int i=0;i<s.length();i++) {
			//if(s.charAt(i)!=' ');
			c++;
		}
		System.out.println("Total character in string : " +c);
	}

}
