package com.obsqura.JavaTraining.abstraction;

import java.util.Scanner;

public class HDFC implements RBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h = new HDFC();
		h.fixedDeposit();
	}

	@Override
	public void fixedDeposit() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner((System.in));
		System.out.println("Enter the amount");
		long amount = sc.nextLong();
		System.out.println("Enter the duration");
		double duration = sc.nextDouble();
		double fixedamount = amount*interestrate*duration;
		System.out.println("Amount after the fixed period is "+fixedamount);
		
	}

}
