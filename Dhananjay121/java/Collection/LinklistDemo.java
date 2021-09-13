package com.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinklistDemo {
public static void main(String args[]) {
	LinkedList<String>link=new LinkedList<String>();//add linklist
	
    link.add("Green");
    link.add("Black");
    link.add("White");
    link.add("Pink");
    link.add("Yellow");
    System.out.println(link);
    System.out.println("add the yellow col after the pink"+link);//specific position
    link.add(1,"yellow");
    System.out.println(link);
    Iterator<String> tr= link.listIterator();//iterator
    while (tr.hasNext()) {
        System.out.println(tr.next());
    }
    
    Iterator<String> tr1= link.listIterator(1); //specifice iterator position
    while (tr.hasNext()) {
        System.out.println(tr.next());
    }
    Iterator<String> tr2= link.descendingIterator();
    System.out.println("Elements in Reverse Order:");//reverse order
    
    while (tr2.hasNext()) {
    System.out.println(tr2.next());
    }
    link.addFirst("white");// add first and last
    link.addLast("green");
    System.out.println(link);
    
    
}
}
