package com.Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "rahul");
		tm.put(2, "raja");
		tm.put(3, "ankit");
		tm.put(4, "prince");
		System.out.println(tm);

		System.out.println("Orginal TreeMap : " + tm);
		System.out.println("Greatest key: " + tm.firstEntry());
		System.out.println("Least key: " + tm.lastEntry());

		Iterator<Integer> tr = tm.keySet().iterator();
		while (tr.hasNext()) {
			tm.keySet();
			Integer keydemo = tr.next();

			String valuedemo = tm.get(keydemo);

			System.out.println("key=" + keydemo + "values=" + valuedemo);

			TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>();
			tm1.put(5, "rohit");
			tm1.put(6, "kohli");
			tm1.put(7, "pant");
			tm1.put(8, "arun");
			System.out.println(tm1);

			Iterator<Integer> tr1 = tm1.keySet().iterator();
			while (tr.hasNext()) {
				tm.keySet();
				Integer keydemo1 = tr.next();

				String valuedemo1 = tm1.get(keydemo1);

				System.out.println("key=" + keydemo1 + "values=" + valuedemo);
			}
			tm.putAll(tm1);
			System.out.println("copy after tm and tm1" + tm);

			System.out.println("Is the key '9' present? " + tm.containsKey(9));// shot key

			System.out.println("Is the values '4' present? " + tm.containsKey(4));

			tm.clear();
			System.out.println("new map" + tm);// delete
			tm1.clear();
			System.out.println("new map" + tm1);

		}

	}

}

//sortket,search key
