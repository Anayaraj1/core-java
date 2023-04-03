package com.Pyramid;

public class Pyramid3 
{
	/*
	 * 
	 * *
	 * * *
	 * * * *
	 * * * * *
	 
	 
	 =======
	 ++++++
	 */
	public static void main(String[] args) 
	{
		
	
		for (int i=1; i<=5;i++)
		{
			for (int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int r=5-1;r>=0;r--)
		{
			for(int c=0;c<=r;c++)
			{
				System.out.print(c);
				
			}
			System.out.println();
		}

	}
}
