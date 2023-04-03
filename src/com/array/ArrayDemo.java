package com.array;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args)
	{
		
		int a[] =new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Value..."+i);
			
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
	}
