package com.obsqura.JavaTraining.aggregation;

public class Book {
	String bookName;
	int price; 
    Author a;

	public Book(String bookName, int price, Author a) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.a = a;
	}
	void display() {
		System.out.println("Book Name-> "+bookName+"   Price "+price);
		System.out.println("Author Name-> "+a.authorName+"    Age-> "+a.age+"   Place: "+a.place);
	}

	public static void main(String[] args) {
		Author a = new Author("Author1",50,"Kochi");
        Book b = new Book("Book1",600,a);
        b.display();

	}

}
