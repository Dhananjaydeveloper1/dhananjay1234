package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String args[]) {
		List<String> li = new ArrayList<String>(); // create arraylist
		li.add("Ravi");// Adding object in arraylist
		li.add("Vijay");
		li.add("Ravi");
		li.add("Ajay");
		System.out.println(li);
		li.get(3);// retrive arraylist
		li.remove(3);
		System.out.println(li);// remove arraylist
		li.add(2,"hello");// add arraylist
		li.set(3, "hii");// update arraylist

		if (li.contains("vjay")) {
			System.out.println("Found the element"); // search
		} else {
			System.out.println("There is no such element");
		}
		System.out.println("Before Sorting: " + li);// sort the arraylist

		System.out.println("After Sorting: " + li);
		Iterator<String> tr = li.iterator(); // iterator
		while (tr.hasNext()) {
			System.out.println(tr.next());
		}
	}
}
