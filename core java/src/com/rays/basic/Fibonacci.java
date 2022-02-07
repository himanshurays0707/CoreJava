package com.rays.basic;

public class Fibonacci {
	public static void main (String [] args) {
		int a=0;
		int b=1;
		int c;
        int d =5;
        System.out.println( +a);
        System.out.println( +b);
        for(int i=0;i<=d;i++) {
        	c= a+b;
        	System.out.println(+c);
        	a=b;
        	b=c;
        }
	}

}
