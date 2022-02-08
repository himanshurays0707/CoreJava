package com.rays.oop;

import java.util.Date;

public class Person {
	private String name=null;
	private String dob;
	private String address;
	private static int AVG_AGE;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob= dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address= address;
	}
	public int getAvg_age() {
		return AVG_AGE;
	}
	public void setAvg_age(int AVG_AGE) {
		this.AVG_AGE= AVG_AGE;
	}
}
