package com.obsqura.JavaTraining.aggregation;

public class Employee {
	String empName;
	int empId;
	Car c;
	Bike b;
	
	public Employee(String empName, int empId, Car c, Bike b) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.c = c;
		this.b = b;
	}

	void display() {
		System.out.println("Employee Name-> "+empName+"   Employee Id "+empId);
		System.out.println("Car Name-> "+c.color+"    Color-> "+c.carName+"   Registration No: "+c.regNo);
		System.out.println("Bike Name-> "+b.bikeName+"    Registration No-> "+b.regNo);
	}

	public static void main(String[] args) {
		Car c = new Car("Venue","Red",7239);
		Bike b = new Bike("Pulsor",1234);
        Employee e = new Employee("Krishna",34568917,c,b);
        e.display();

	}

}
