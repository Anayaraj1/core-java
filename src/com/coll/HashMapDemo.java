package com.coll;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap h1 = new HashMap();
		System.out.println("Default size is.."+h1.size());
		System.out.println("Default value is.."+h1);
		
		h1.put(1,"Tapan");
		h1.put("Tapan",1);
		h1.put('T',"Tops");
		h1.put(10.02f,123);
	    h1.put(2,"Tops");
		
		System.out.println("Now size is..."+h1.size());
		System.out.println("Now Value is..."+h1);
		
		Set set = h1.entrySet();
		Iterator i1= set.iterator();
		
		while(i1.hasNext())
		{
			Map.Entry me = (Map.Entry)i1.next();
			System.out.println("Key is.."+me.getKey());
			System.out.println("Value is.."+me.getValue());
			System.out.println();
		}

	}
}
