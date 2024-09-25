package com.obsqura.JavaTraining.aggregation;

public class LineItem {
	int quantity;
	Product p;
	

	public LineItem(int quantity, Product p) {
		super();
		this.quantity = quantity;
		this.p = p;
	}
	
	void display() {
		System.out.println("Quantity-> "+quantity);
		System.out.println("Id-> "+p.id+" Name-> "+p.name+" Description-> "+p.description);
	}


	public static void main(String[] args) {
		Product p1 = new Product(1,"ABC","Desc1");
		LineItem l1 = new LineItem(10,p1);
		l1.display();
		Product p2 = new Product(2,"DEF","Desc2");
		LineItem l2 = new LineItem(20,p2);
		l2.display();
		Product p3 = new Product(3,"GHI","Desc3");
		LineItem l3 = new LineItem(30,p3);
		l3.display();
	}

}
