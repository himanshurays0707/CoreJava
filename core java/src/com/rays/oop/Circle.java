package com.rays.oop;

public class Circle extends Shape {
	private double radius;
	private double PI;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public void area() {
		PI =3.14;
		double a = PI*radius*radius;
		System.out.println("Area of Circle is :" +a);
		
	
	}
	

}
