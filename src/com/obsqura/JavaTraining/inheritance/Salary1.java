package com.obsqura.JavaTraining.inheritance;

import java.util.Scanner;

public class Salary1 {
	double deduction;
	double bonus;
	double basicpay;
	public void input( ) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the basic pay: " +basicpay );
	basicpay = sc.nextInt();
	System.out.println("Enter the deduction amount: "+deduction);

	deduction = sc.nextInt();
	System.out.println("Enter the bonus: "+bonus);
	bonus = sc.nextInt();
	}

}
