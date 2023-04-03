package com.coll;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo 
{
	 public static void main(String[] args) 
	 {
		HashSet h1 = new HashSet();
		System.out.println("Default size is.."+h1.size());
		System.out.println("Default Value is..."+h1);
		
		h1.add(100);
		h1.add("Tapan");
		h1.add('T');
		h1.add("tapan");
		h1.add(new Integer(123));
		
		System.out.println("Now size is.."+h1.size());
		System.out.println("Now Value is.."+h1);
		h1.remove("Tapan");
		System.out.println("Now size is.."+h1.size());
		System.out.println("Now Value is.."+h1);
		
		Iterator i1 = h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
	 }
}
