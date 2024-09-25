package com.obsqura.JavaTraining.inheritance;

public class Salary3 extends Salary2 {
	double totalsalary;
	public void totalsalary() {

	totalsalary = basicpay + hra - pf-deduction+bonus;
	}
	public void salaryslip() {
	System.out.println("Salary Slip ");
	System.out.println("Basic Pay "+basicpay );
	System.out.println("Deduction "+deduction);
	System.out.println("Bonus "+bonus );
	System.out.println("HRA "+hra);
	System.out.println("PF "+pf);
	System.out.println("Total Salary "+totalsalary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary3 s = new Salary3();
		s.input();
		s.calculation();
		s.totalsalary();
		s.salaryslip();
		}

}

