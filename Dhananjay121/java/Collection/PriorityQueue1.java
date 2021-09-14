package com.Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String args[]) {
		PriorityQueue<String> pr = new PriorityQueue<String>();
		pr.add("Black");
		pr.add("Blue");
		pr.add("Red");
		pr.add("pink");
		System.out.println(pr);

		Iterator<String> tr = pr.iterator();
		while (tr.hasNext()) {
			System.out.println(tr.next());
		}
		PriorityQueue<String> pr1 = new PriorityQueue<String>();
		pr1.add("yellow");
		pr1.add("orange");
		pr1.add("green");
		System.out.println(pr1);
		pr.addAll(pr1);
		System.out.println(pr1);
		Iterator<String> tr1 = pr1.iterator();
		while (tr1.hasNext()) {
			System.out.println(tr1.next());
		}

		pr.add("blue1");
		pr1.offer("red1");
		System.out.println(pr);
		System.out.println("original priorityQueue" + pr1);
		System.out.println("enter the size=" + pr1.size());
		pr1.removeAll(pr1);
		pr.removeAll(pr);//
		System.out.println("remove all priorityQueue1" + pr1 + "remove all priorityQueue" + pr);

		System.out.println("enter the size=" + pr1.size());

	}
}
