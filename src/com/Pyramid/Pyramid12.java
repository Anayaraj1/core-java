package com.Pyramid;

public class Pyramid12
{
	public static void main(String[] args) 
	{
		/*
		 				1
		 			 1     0			
		          1    0     1
		       1    0 	1    0  1 	 
		 
		 g
		  */
		
		
		for (int i=5 ; i>=1;i--)
		{
			for (int k=i;k>=1;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
	}
}
