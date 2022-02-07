package com.rays.basic;

public class Secondlargestnumber {
	public static void main(String[] args) {
		int a[] = {54,7,45,96,200};
		int f = 0;
		int x = 0;
		int g[]= a;
	
		for(int i=0;i<a.length;i++) {
			if(g[i]>x) {
				f=x;
				x=g[i];
			}else if(g[i]>f&&g[i]>x)
			{
				f=g[i];
			}
			
			}
		System.out.println("Second largest number is : " +f );
		}
	}


 