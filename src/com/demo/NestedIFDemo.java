package com.demo;

public class NestedIFDemo
{
	public static void main(String[] args) 
	{
//		int no=-0;
//		if(no>=0)
//		{	
//			if(no == 0)
//			{
//				System.out.println("Your No is Zero..."+no);
//			}
//			else
//			{
//				System.out.println("Your No is Positive..."+no);
//			}
//		}
//		else
//		{
//			System.out.println("your No is negative..."+no);
//		}
		
		
		int a=10,b=20,c=30;
		if (a>b)
		{
			if(a>c)
			{
				System.out.println("A is Max...");
			}
			else
			{
				System.out.println("C is Max...");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B is Max...");
			}	
			else
			{
				System.out.println("C is Max...");
			}
			
			System.out.println();
		}
			
		
	}
}
