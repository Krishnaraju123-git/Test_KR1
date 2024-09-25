package com.obsqura.JavaTraining.inheritance;

public class Salary2 extends Salary1{
	double hra;
	double pf ;
	public void calculation() {
	hra = basicpay * 25/100;
	pf = basicpay * 20/100;
	}

}
