package com.array;

public class ArrayDemo3 
{
	public static void main(String[] args) 
	{
		int [][] a = new int[3][3];
		int [][] b = new int[3][3];
		int [][] c = new int[3][3];
		int k =1 ;
		
		for (int i=0;i<3;i++)
		{
			
			for (int j=0;j<3;j++)
			{
				a[i][j]=k++;
				System.out.print(a[i][j]+"");
			}
			System.out.println();
			
		}
		System.out.println();
		int l=1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=l++;
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Now Sum Start...");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
