package com.Package;

import java.util.Iterator;
import java.util.LinkedList;

public class linklist {
	public static void main(String args[]) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("mohan");
		linkedlist.add("djhsfu");
		linkedlist.add("sj");

		Iterator<String> it = linkedlist.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}
}
