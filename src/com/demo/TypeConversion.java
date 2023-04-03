package com.demo;

public class TypeConversion
{
	public static void main(String[] args) 
	{
		int a=10;//4 Bytes
		
		long l = a; // 8 bytes
		System.out.println("Implicit is.."+l);
		
		int x =(int)l;
		System.out.println("Explcit is.." + x);
		
		byte b; 
		int z = 9856589 ;
		
		b = (byte)z;
		System.out.println("Byte is ..." + b);
		
	}
}
