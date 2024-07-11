package com.obsqura.JavaTraining.inheritance;

public class B extends A {

		void display1()
		{
			System.out.println("Method 3");
		}
		
		public static void main(String[] args) {
			B b = new B();
			b.display();
			b.print();
			b.display1();

		}

}
