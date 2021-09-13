package com.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSet1 {

	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		System.out.println(set);

		String[] new_array = new String[set.size()]; // hashset to array
		set.toArray(new_array);

		// Displaying Array elements
		System.out.println("Array elements: ");
		for (String element : new_array) {
			System.out.println(element);
		}
		List<String> list1 = new ArrayList<String>(set);// list and arraylist

		// Display ArrayList elements
		System.out.println("ArrayList contains: " + list1);
		Iterator<String> tr = set.iterator();
		while (tr.hasNext()) {
			System.out.println(tr.next());
			System.out.println(set.size()); // size
			System.out.println(set.removeAll(set));// empty
			System.out.println("Checking the above array list is empty or not! " + set.isEmpty());
			System.out.println("Remove all the elements from a Hash Set: ");
			set.removeAll(set);
			System.out.println("Hash Set after removing all the elements " + set);
			set = (HashSet<String>) set.clone();
			System.out.println(set);

		}
	}

}
