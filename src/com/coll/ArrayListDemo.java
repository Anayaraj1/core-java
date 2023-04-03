package com.coll;

import java.util.ArrayList;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		System.out.println("Default size is.."+a1.size());
		System.out.println("Default Value is.."+a1);
		
		a1.add(100);
		a1.add('T');
		a1.add("Tapan");
		a1.add(10.20f);
		a1.add(new Integer(123));
		
		
		System.out.println("Now size is..."+a1.size());
		System.out.println("Now Value is..."+a1);
		
		a1.remove(1); //remove by index
		
		System.out.println("Now size is..."+a1.size());
		System.out.println("Now value is..."+a1);
		
		a1.remove(new Integer(123));
		System.out.println("Now size is..."+a1.size());
		System.out.println("Now value is..."+a1);
		
	}
}
