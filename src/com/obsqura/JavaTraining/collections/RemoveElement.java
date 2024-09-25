package com.obsqura.JavaTraining.collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> itrl = new ArrayList<Integer>();
		itrl.add(1);
		itrl.add(2);
		itrl.add(3);

		itrl.add(4);
		itrl.add(5);
		System.out.println("List before removing element is "+itrl);
		itrl.remove(2);
		System.out.println("List after removing element is "+itrl);
		}

}
