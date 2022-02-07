package com.rays.basic;

public class Occuranceofcharacter {
	public static void main(String[] args) {
		String s ="Rays Technology Indore";
		char c='n';
		int a = 0;
		
		for(int i=0; i<s.length(); i++) {
			
			if(c == s.charAt(i)) {
			
			a++;
			
			}
		}
		System.out.println("Total character in string : " + a);
	}


}
