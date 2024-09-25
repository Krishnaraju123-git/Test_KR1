package com.obsqura.JavaTraining.arralistexample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add("Orange");
		al.add("Yellow");
		System.out.println("Array list is "+al);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}

}
