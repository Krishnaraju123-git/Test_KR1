package com.obsqura.JavaTraining.encapsulation;

public class User {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.setPin(1234);
		int p = b.getPin();
		System.out.println("Pin number is "+p);
	}

}
