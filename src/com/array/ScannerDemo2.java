package com.array;

import java.util.Scanner;

public class ScannerDemo2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 =new Scanner(System.in);
		System.out.println("Enter Number : ");
		int no = sc.nextInt();
		
		System.out.println("Enter Name: ");
		String name = sc1.nextLine();
		System.out.println("Your no is..."+no);
		System.out.println("Your name is..."+name);
	}
}
