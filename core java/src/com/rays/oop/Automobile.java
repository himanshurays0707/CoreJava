package com.rays.oop;

public class Automobile {
	public String color;
	public int speed;
	public String make;
	
	private static int NO_OF_GEARS;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make=make;
	}
	public int getNO_OF_GEARS() {
		return NO_OF_GEARS;
	}
	public void setNO_OF_GEARS(int NO_OF_GEARS) {
		this.NO_OF_GEARS=NO_OF_GEARS;
	}

}
