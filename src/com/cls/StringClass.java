package com.cls;

public class StringClass 
{
	public static void main(String[] args) 
	{
		String s1 = new String("This is Tops Technologies...");
		System.out.println("Origal is ..."+s1);
		System.out.println("Length is..."+s1.length());
		System.out.println("UpperCase is..."+s1.toUpperCase());
		System.out.println("LowerCase is..."+s1.toLowerCase());
		System.out.println("Substring is..."+s1.substring(2));
		System.out.println("Substring is..."+s1.substring(2,4));
		System.out.println("Char is..."+s1.charAt(5));
		if (s1.equalsIgnoreCase(s1))
		{
			System.out.println("Both are equals...");
		}
		else
		{
			System.out.println("Both are not equal...");
		}
		System.out.println("Compare string "+s1.compareToIgnoreCase(s1));
		System.out.println("Original is..."+s1);
		System.out.println("Length is..."+s1.length());
	}
}
