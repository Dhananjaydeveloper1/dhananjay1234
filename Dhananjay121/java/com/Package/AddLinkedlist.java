package com.Package;

import java.util.Iterator;
import java.util.LinkedList;

public class AddLinkedlist {
public static void main(String args[]) {
	
	LinkedList<String> linkedlist1=new LinkedList<String>();
	linkedlist1.add("cricket");
	linkedlist1.add("players");
	
	LinkedList<String> linkedlist2=new LinkedList<String>();
	linkedlist2.add("football");
	linkedlist2.add("hockey");
	linkedlist2.add("hockeyplayers");
	
	linkedlist2.addAll(linkedlist1);
	
	Iterator<String> it = linkedlist2.iterator();
	while(it.hasNext()) {
	System.out.println(it.next());
	
}
}
}