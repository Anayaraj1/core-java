package com.ex;

import java.util.Scanner;

public class ExceptionDemo1 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 value::");
			int a = sc.nextInt();
			System.out.println("Enter 2 value::");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("Division is::"+c);
			System.out.println("Programme is completed");
			
			
		}
//			catch(Exception e)
//		{
//			System.out.println("ERROR EXCEPTION ");
//			e.printStackTrace(); // this is for only print the error statement ..
//		}
		finally 
		{
			System.out.println("THis is progaramme developed  Tapan Mewada");
			System.out.println("TM");
			System.out.println("MO:9510886510");
		}
		for (int i = 1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
}
