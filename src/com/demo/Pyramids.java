package com.demo;

public class Pyramids 
{
	public static void main(String[] args) 
	{
		/*
		  1
		  12
		  123
		  1234
		  12345
		 */
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		/*
		 1
		 21
		 321
		 4321
		 54321
		 */
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=5;j>=i;j--)
//			{
//				System.out.print(j);
//			}
//			
//		}
	}
}
