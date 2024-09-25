package com.obsqura.JavaTraining.collections;

import java.util.ArrayList;
import java.util.List;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ltr = new ArrayList<Integer>();
		ltr.add(1);
		ltr.add(2);
		ltr.add(3);
		ltr.add(4);
		if(ltr.contains(10)) {

		System.out.println("Element is found in the array");
		}
		else {
		System.out.println("Element is not found in the array");
		}

	}

}
