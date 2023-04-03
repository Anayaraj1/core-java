package com.cls;

public class WrapperClassDemo 
{
	public static void main(String[] args) 
	{
		Integer i1 = new Integer(123);
		System.out.println("AutoBoxing is.."+i1);
		
		int a = 888;
		Integer i2 = new Integer(a);
		System.out.println("Boxing is.."+i2);
		
		int x=i1.intValue();
		System.out.println("Unboxing is..."+x);
		
		String s="789";
		int z = Integer.parseInt(s);
		System.out.println("Unboxing is..."+z);
	
	}
}
