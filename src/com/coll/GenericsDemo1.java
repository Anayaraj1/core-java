package com.coll;

import java.util.ArrayList;

public class GenericsDemo1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(123);
		a1.add(100);
		
		System.out.println(a1);
	}
}
