package com.obsqura.JavaTraining.interface1;

public class Example1 implements InterfaceExample {
	public void display()
	{
		System.out.println("Abstract method is displayed");
	}

	public static void main(String[] args) {
		Example1 e = new Example1();
		e.display();
		InterfaceExample.print();
		

	}

}
