package com.Pyramid;

public class Pyramid6 
{
	public static void main(String[] args) 
	{
		/*
		   5
		  45
		 345
		2345
	   12345	  
		 
		  */
		for(int i=5;i>=1;i--)
		{
			
			for (int k=i ; k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
