package com.obsqura.JavaTraining.abstraction;

import java.util.Scanner;

public class Contractor extends Employee{

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the worked hours");
		double hrs = sc.nextDouble();
		System.out.println("Enter the payment value per hour");

		int hrpayment = sc.nextInt();
		double salary = hrpayment * hrs;
		System.out.println("Salary of employee per working hours is "+salary);
		}

}
