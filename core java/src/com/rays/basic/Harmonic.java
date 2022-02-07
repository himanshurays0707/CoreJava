package com.rays.basic;

public class Harmonic {
	public static void main(String[] args) {
		int n=10;
		double r=0.0;
		System.out.println("Harmonic series is : ");
		while(n>0) {
			r=r+(double)1/n;
			n--;
		System.out.println("result is : " +r);
	}
	}
}
