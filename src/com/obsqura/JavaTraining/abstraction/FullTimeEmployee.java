package com.obsqura.JavaTraining.abstraction;

import java.util.Scanner;

public class FullTimeEmployee extends Employee{ 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Contractor();
		e.calculateSalary();
		Employee c = new FullTimeEmployee();
		c.calculateSalary();

	}
	void calculateSalary() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the payment per hour");
		double salaryhr = sc.nextDouble();
		double salary = salaryhr * 8;
		System.out.println("Salary of employee is "+salary);
		}
}
