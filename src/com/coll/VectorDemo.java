package com.coll;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo 
{
	public static void main(String[] args) 
	{
		Vector v1 = new Vector(2,1);
		
		System.out.println("Default size is.."+v1.size());
		System.out.println("Default value is.."+v1);
		System.out.println("Deault capacity is.."+v1.capacity());
		
		v1.addElement(10);
		v1.add(1);
		v1.add("Tapan");
		v1.add(100.520f);
		v1.add(new Integer (123));
		
		System.out.println("Now Size is ..."+v1.size());
		System.out.println("Now Value is..."+v1);
		System.out.println("Now Capacity is..."+v1.capacity());
		
		Enumeration e1= v1.elements();
		while (e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
		Iterator i1 = v1.iterator();
		
		while (i1.hasNext());
		{
			System.out.println(i1.next());
		}
		
		
		
	}
}
