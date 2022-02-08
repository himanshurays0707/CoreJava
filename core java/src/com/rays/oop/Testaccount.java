package com.rays.oop;

public class Testaccount {
	public static void main(String[] args) {
		Account t;
		t = new Account();
		t.setAccountNumber("215468798321");
		t.setAccountType("Saving");
		t.setBalance(1000.30);
		System.out.println(t.getAccountNumber());
		System.out.println(t.getAccountType());
		System.out.println(t.getBalance());
		
		
	}
	

}
