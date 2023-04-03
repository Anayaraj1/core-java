package com.Pyramid;

public class Pyramid4 
{
	public static void main(String[] args) 
	{
		/*
		  12345
          1234
	      123
		  12
          1
		  
		 */
		 for(int i=6-1;i>=1;i--)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
		
	}
}
