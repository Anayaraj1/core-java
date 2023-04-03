package com.array;

import java.util.Scanner;

public class JaggedArray 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of Row required ..");
		int row = sc.nextInt();
		int [][] a=new int [row][];
		for (int i=0;i<a.length;i++)//row
		{
			System.out.println("Enter how many column on "+i+"Row");
			int cols = sc.nextInt();
			a[i]=new int [cols];
		}
		for(int i= 0;i<a.length;i++)
		{
			System.out.println("Now start"+i+"th row");
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter Value..");
				a[i][j]=sc.nextInt();
			}
		}
		for(int i= 0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
