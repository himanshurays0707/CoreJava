package com.rays.oop;

public class AccountException {
	private String accnumber;
	private String acctype;
	private double balance;
	
	public AccountException() {}
	public AccountException(String n, String a, double b) {
		accnumber=a;
		acctype=a;
		balance=b;
	}
	public String getAccnumber() {
		return accnumber;
	}
	public String getAcctype() {
		return acctype;
	}
	public double getBalance() {
		return balance;
	}
	public void withdraw(double i) {
		double d=getBalance();
		try {
			if(d-500<i) {
				unsufficiantException e= new unsufficiantException();
				throw e;
			}
			d-=i;
			this.balance=d;
		}
		catch(Exception e) {
			System.out.println("Unsufficant balance");
		}
		}
	public void fundtransfer(double i) {
		double d = getBalance();
		d-=i;
		this.balance=d;
	}
	}
	

