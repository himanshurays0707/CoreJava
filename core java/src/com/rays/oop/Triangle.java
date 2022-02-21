package com.rays.oop;

public class Triangle extends Shape {
	private int base;
	private int height;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double area(double a) {
		double a1 = base* height;
		System.out.println("Area of Triangle is :" +a1);
		return a1;
		
	}

}
