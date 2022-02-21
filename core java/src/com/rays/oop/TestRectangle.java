package com.rays.oop;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r= new Rectangle();
		r.setColor("Black");
		r.setBorderWidth(10);
		r.setLength(5);
		r.setWidth(6);
		r.area();
	    System.out.println(r.getColor());
	    System.out.println(r.getBorderWidth());
	    
		
	}

}
