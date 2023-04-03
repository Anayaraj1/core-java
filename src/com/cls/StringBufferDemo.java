package com.cls;

public class StringBufferDemo 
{
	public static void main(String[] args) 
	{
		StringBuffer s1 =new StringBuffer("This is tops Technologies...");
		System.out.println("Original is..."+s1);
		System.out.println("Length is..."+s1.length());
		s1.insert(0,"Hii ");
		System.out.println("Original is..."+s1);
		System.out.println("Length is..."+s1.length());
		s1.append("Tapan Mewada");
		System.out.println("Original is..."+s1);
		System.out.println("Length is..."+s1.length());
		s1.delete(0,4);
		System.out.println("Original is..."+s1);
		System.out.println("Length is..."+s1.length());
		System.out.println("UpperCase..."+s1.toString().toUpperCase());
		System.out.println("Reverse is..."+s1.reverse());
		System.out.println("Originals is..."+s1);
		System.out.println("Length is..."+s1.length());
		s1.reverse();
		System.out.println("Original is.."+s1);
		System.out.println("Length is.."+s1.length());
		
		
	}
}
