package com.rays.oop;

public class TestAccountException {
	public static void main(String[] args) {
		AccountException ac = new AccountException("1296875132" ,"Saving Account" , 5000.25);
		ac.withdraw(500);
		System.out.println(ac.getBalance());
		
	}

}
