package com.rays.oop;

public class Testshape {
	public static void main(String[] args) {
		Shape s;
		s = new Shape();
		s.setColor("black");
		s.setBorderWidth(25);
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
	}
}
