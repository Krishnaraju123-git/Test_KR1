package com.obsqura.JavaTraining.abstraction;

public class Demo implements Sample,Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.method();
		d.method1();
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("Multiple Inheritance method1");
		
	}
	public void method1() {
		System.out.println("Multiple Inheritance method2");
		}

}
