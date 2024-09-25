package com.obsqura.JavaTraining.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intlist = new ArrayList<Integer>();
		intlist.add(1);
		intlist.add(2);

		intlist.add(3);
		intlist.add(4);
		intlist.add(5);
		System.out.println("Iterate through elements in arraylist");
		Iterator<Integer> itr = intlist.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}

	}

}
