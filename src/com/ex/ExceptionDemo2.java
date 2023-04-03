package com.ex;

import java.util.Scanner;

public class ExceptionDemo2 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			int [] a =new int[5];
			for (int i = 0 ; i<=5;i++)
			{
				for(int x=1 ; x<i;x++)
				System.out.println("Enter Value::"+x);
				a[i]=sc.nextInt();
			}
			for (int i = 0 ; i<5;i++)
			{
				System.out.println(a[i]);
			
			}
			System.out.println("Program comleted...");
		}catch(Exception e)
		
		{
			//System.out.println(e);
			e.printStackTrace();
		}
	}
}
