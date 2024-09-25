package com.obsqura.JavaTraining.abstraction;

public class Triangle extends Shape{

	public static void main(String[] args) {
		Shape s=new Triangle();
		s.display();

	}

	@Override
	void display() {
		System.out.println("Shape is Triangle");
		
	}

}
