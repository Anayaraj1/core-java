package com.demo;

public class DataTypeDemo
{
public static void main(String[] args) 
{
	int i1 = 2147483647; //4 bytes
	long l1 = 12145; // 8 bytes
	byte b1 = 127; // 1 byte
	float f1 = 1333.23f; // 4 bytes
	double d1 = 1235.51; // 8 bytes
	boolean bb = true; // 1byte
	char c1 = 'T'; // 2bytes
	
	
	
	System.out.println("Integer..." + i1); // -2147
	System.out.println("Long..." + l1);
	System.out.println("Byte..." + b1);
	System.out.println("Float..." + f1);
	System.out.println("Doubles..." + d1);
	System.out.println("Boolean..." + bb);
	System.out.println("Character.." + c1);
	
	System.out.println("Int SIZE is ..." + Integer.BYTES + "bytes");
	System.out.println("Int SIZE is ..." + Long.BYTES + "bytes");
	System.out.println("Int SIZE is ..." + Float.BYTES + "bytes");
	System.out.println("Int SIZE is ..." + Double.BYTES + "bytes");
//	System.out.println("Int SIZE is ..." + Boolean.BYTES + "bytes");
	System.out.println("Int SIZE is ..." + Character.BYTES + "bytes");
	
}
}
