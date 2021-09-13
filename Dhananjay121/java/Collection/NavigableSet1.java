package com.Collection;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet1 {
	public static <ts> void main(String[] args) {
		NavigableSet<String> ts = new TreeSet<String>();

		ts.add("yellow");
		ts.add("Black");
		ts.add("Red");
		ts.add("orange");
		ts.add("green");
		System.out.println(ts);

		NavigableSet<String> ts1 = new TreeSet<String>();
		ts1.add("yellow");
		ts1.add("Black");
		ts1.add("white");
		ts1.add("orange");
		ts1.add("blue");

		System.out.println(ts1);
		ts.addAll(ts1);
		System.out.println("Tree set1: " + ts1);
		TreeSet<String> tree_set1 = new TreeSet<String>(ts); // treeset1
		TreeSet<String> tree_set2 = new TreeSet<String>(ts1);// treeset2
		tree_set1.addAll(tree_set2);
		System.out.println("Tree set1: " + tree_set1);

		Iterator it = ts.descendingIterator();// reverse order

		System.out.println("Elements in Reverse Order:");
		while (it.hasNext()) {
			System.out.println(it.next());

			Object frist_Element = ts.first();//size of tree
			System.out.println("First Element is: " + ts.first());
			Object last_Element = ts.last();
			System.out.println("last Element is:" + ts.last());

			System.out.println("Size of the tree set: " + ts.size());
			TreeSet<String> result_set = new TreeSet<String>();
			
	         for (String element : ts1){
	             System.out.println(ts1.contains(element) ? "Yes" : "No");
		}
		}}}

	
	
