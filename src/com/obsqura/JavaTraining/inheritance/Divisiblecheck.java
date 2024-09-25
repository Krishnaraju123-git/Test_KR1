package com.obsqura.JavaTraining.inheritance;

public class Divisiblecheck extends Addition {
	
	public void addition() {
		int sum = super.addition(55,65);
		System.out.println("Sum of 2 numbers is "+sum);
		int output = sum/10;
		System.out.println("Result after division by 10 is "+output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisiblecheck d = new Divisiblecheck();
		d.addition();

	}

}
