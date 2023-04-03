package com.array;

import java.util.Scanner;

public class ScannerDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 =");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 =");
		int no2 = sc.nextInt();
		System.out.println("Sum is ..."+(no1+no2));
	}
}
