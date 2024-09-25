package com.obsqura.JavaTraining.aggregation;

public class Address {
	String address;
	Student s;
	
	public Address(String address,Student s)
	{
		super();
		this.address = address;
		this.s = s;
	}
	
	void display() {
		System.out.println("Student Name-> "+s.name+" Roll Number-> "+s.rollno);
		System.out.println("Address-> "+address);
	}

	public static void main(String[] args) {
		Student s1 = new Student("Krishna",1);
        Address a1 = new Address("ABC",s1);
        a1.display();
        Student s2 = new Student("Alankrita",2);
        Address a2 = new Address("DEF",s2);
        a2.display();
	}

}
