package com.Package;

import java.util.Iterator;
import java.util.Vector;

public class vector {
public static void main(String args[]) {
	Vector <String> vr=new Vector<String>();
	  vr.add("Tiger");  
      vr.add("Lion");  
      vr.add("Dog");  
      vr.add("Elephant");  
       
      vr.addElement("Rat");  
      vr.addElement("Cat");  
      vr.addElement("Deer");  
        Iterator<String> it=vr.iterator();
      
      	while(it.hasNext()) {
      		System.out.println(it.next());
      		
      	}
 
}	
}
