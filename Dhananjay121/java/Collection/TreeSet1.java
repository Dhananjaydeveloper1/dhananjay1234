package com.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {

		TreeSet<Integer> t_num = new TreeSet<Integer>();
		TreeSet<Integer> theadset = new TreeSet<Integer>();

		// Add numbers in the tree
		t_num.add(1);
		t_num.add(2);
		t_num.add(3);
		t_num.add(5);
		t_num.add(6);
		t_num.add(7);
		t_num.add(8);
		t_num.add(9);
		t_num.add(10);

		theadset = (TreeSet) t_num.headSet(7);

		Iterator iterator;
		iterator = theadset.iterator();

		System.out.println("Tree set data: ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
	}
}