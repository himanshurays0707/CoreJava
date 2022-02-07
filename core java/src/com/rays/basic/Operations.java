package com.rays.basic;

public class Operations {
	public static void main(String []args) {
		
		StringBuffer sb = new StringBuffer("Vijay");
		sb.append(" Dinanath Chauahan");
		//System.out.println("String Length :"  +name.length());
		//System.out.println("Substring :" +name.substring(5));
		//System.out.println("All a is replaced by @ : " +name.replaceAll("a","@" ));
		//System.out.println("Starts with vijay :"  +name.startsWith("Dinanath"));
		//System.out.println("Ends with han :"  +name.endsWith("vijay"));
		//System.out.println("Reverse :"  +sb.reverse());
		//System.out.println("Capacity : "  +sb.capacity());
		//System.out.println("Replace :"  +sb.replace(5, 10, "Jay")); 
		//System.out.println("Mathematics operations");
		//System.out.println("Absolute : "  +Math.abs(-5));
		//System.out.println("Exp 20 : "  +Math.exp(20));
		for(int i=1;i<=5;i++) {
			System.out.println("Random number : "  + (int)(Math.random()*10));	
		}
		
	}

}