package com.Pyramid;

public class Pyramid5 
{
	public static void main(String[] args) 
	{
		/*
		 1                                               1
		12												 12
	   123
	  1234          so first make that type of pyramids
	 12345  	 
		 */
		for (int i=1;i<=5;i++)
		{
			
//			for(int k=i;k<=5;k++) //here for the spcing
//			{
//				System.out.print(" ");
//			}
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
