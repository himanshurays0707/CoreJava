package com.rays.basic;

public class Name {
	public static void main(String [] args) {
		 double a = Double.parseDouble(args[0]);
		 double b = Double.parseDouble(args[1]);
		   // int b = Integer.parseInt(args[1]);
		    
		    
		    double sum  = a + b;
		   double prod = a * b;
		    double quot = a / b;
		    //int sub  = a - b;

		    System.out.println(a + " + " + b + " = " + sum);
		   System.out.println(a + " * " + b + " = " + prod);
		   System.out.println(a + " / " + b + " = " + quot);
		   //System.out.println(a + " - " + b + " = " + sub);
	}
}

